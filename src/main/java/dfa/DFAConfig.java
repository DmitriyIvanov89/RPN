package dfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DFAConfig dfaConfig = (DFAConfig) obj;
        return stateDefinition == dfaConfig.stateDefinition &&
                transitionsDefinition == dfaConfig.transitionsDefinition &&
                Objects.equals(startId, dfaConfig.startId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateDefinition, transitionsDefinition, startId);
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
