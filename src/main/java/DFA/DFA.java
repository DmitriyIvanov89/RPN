package DFA;

import DFA.DFAConfig.DFAState;

import java.util.HashMap;
import java.util.Map;

public class DFA {

    private State startState;
    private Map<String, State> dfa;

    public DFA(DFAConfig config) {
        this.dfa = new HashMap<>();
        for (DFAConfig.DFAState state : config.getStateDefinition()) {
            dfa.put(state.getId(), new State(state.getId(), state.isFinite()));
        }
    }

}
