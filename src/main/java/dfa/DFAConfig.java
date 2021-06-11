package dfa;

import java.util.ArrayList;
import java.util.List;

public class DFAConfig {

    private final List<DFAState> stateDefinition;
    private final List<DFATransition> transitionsDefinition;
    private final String startId;

    public DFAConfig(List<DFAState> stateDefinition, List<DFATransition> transitionsDefinition, String startId) {
        this.stateDefinition = new ArrayList<>();
        this.transitionsDefinition = new ArrayList<>();
        this.startId = startId;
    }

    public List<DFAState> getStateDefinition() {
        return stateDefinition;
    }

    public List<DFATransition> getTransitionsDefinition() {
        return transitionsDefinition;
    }

    public String getStartId() {
        return startId;
    }

    public class DFATransition {

        private final String from;
        private final Character symbol;
        private final String to;

        public DFATransition(String from, Character symbol, String to) {
            this.from = from;
            this.symbol = symbol;
            this.to = to;
        }

        public String getFrom() {
            return from;
        }

        public Character getSymbol() {
            return symbol;
        }

        public String getTo() {
            return to;
        }
    }

    public class DFAState {

        private final String id;
        private final boolean finite;
        private String name;

        public DFAState(String id, boolean finite) {
            this.id = id;
            this.finite = finite;
        }

        public String getId() {
            return id;
        }

        public boolean isFinite() {
            return finite;
        }

        public String getName() {
            return name;
        }
    }
}
