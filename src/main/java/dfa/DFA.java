package dfa;

import java.text.CharacterIterator;
import java.util.HashMap;
import java.util.Map;

public class DFA {

    private final State startState;

    public DFA(DFAConfig config) {
        Map<String, State> dfa = new HashMap<>();
        for (DFAConfig.DFAState state : config.getStateDefinition()) {
            dfa.put(state.getId(), new State(state.getId(), state.isFinite()));
            dfa.get(state.getId()).setName(state.getName());
        }
        for (DFAConfig.DFATransition transit : config.getTransitionsDefinition()) {
            dfa.get(transit.getFrom()).addTransition(transit.getSymbol(), dfa.get(transit.getTo()));
        }
        this.startState = dfa.get(config.getStartId());
    }

    public State getStartState() {
        return startState;
    }

    public boolean checkString() {
        //TODO
        return false;
    }

    public TraversalResult greedyTraversal(CharacterIterator iterator) {
        State currState = startState;
        StringBuilder tracer = new StringBuilder();

        while (iterator.getIndex() < iterator.getEndIndex()) {
            char symbol = iterator.current();
            State nextState = currState.getTransition(symbol);
            if (nextState != null) {
                tracer.append(symbol);
                currState = nextState;
                iterator.next();
            } else {
                return new TraversalResult(currState, tracer.toString());
            }
        }

        return new TraversalResult(currState, tracer.toString());
    }
}
