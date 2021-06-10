package DFA;

import java.util.HashMap;
import java.util.Map;

public class DFA {

    private final State startState;
    private State currState;

    public DFA(DFAConfig config) {
        Map<String, State> dfa = new HashMap<>();

        for (DFAConfig.DFAState state : config.getStateDefinition()) {
            dfa.put(state.getId(), new State(state.getId(), state.isFinite()));
            dfa.get(state.getId()).setType(state.getType());
        }

        for (DFAConfig.DFATransition transit : config.getTransitionsDefinition()) {
            dfa.get(transit.getFrom()).addTransition(transit.getSymbol(), dfa.get(transit.getTo()));
        }

        this.startState = dfa.get(config.getStartId());

    }

    public boolean validate(String input) {
        currState = startState;
        for (int i = 0; i < input.length(); i++) {
            currState = currState.getTransition(input.charAt(i));
            if (currState == null) {
                return false;
            }
        }
        return currState.isFinite();
    }

    public State greedyDetour(String input) {
        currState = startState;
        for (int i = 0; i < input.length(); i++) {
            if (currState.hasTransition(input.charAt(i))) {
                currState = currState.getTransition(input.charAt(i));
            }
        }
        return currState;
    }

    public State getStartState() {
        return startState;
    }
}