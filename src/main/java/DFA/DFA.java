package DFA;

import lexicalAnalyzer.TokenType;

import java.util.HashMap;
import java.util.Map;

public class DFA {

    private final State startState;
    private TokenType StateType;

    public DFA(DFAConfig config) {
        Map<String, State> dfa = new HashMap<>();

        for (DFAConfig.DFAState state : config.getStateDefinition()) {
            dfa.put(state.getId(), new State(state.getId(), state.isFinite()));
        }

        for (DFAConfig.DFATransition transit : config.getTransitionsDefinition()) {
            dfa.get(transit.getFrom()).addTransition(transit.getSymbol(), dfa.get(transit.getTo()));
        }

        this.startState = dfa.get(config.getStartId());
        this.StateType = StateType;
    }

    public State getStartState() {
        return startState;
    }

    public TokenType getStateType() {
        return StateType;
    }
}
