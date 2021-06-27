package dfa;

import java.util.Objects;

public class TraversalResult {

    private final State state;
    private final String trace;

    public TraversalResult(State state, String trace) {
        this.state = state;
        this.trace = trace;
    }

    public State getState() {
        return state;
    }

    public String getTrace() {
        return trace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, trace);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TraversalResult traversalResult = (TraversalResult) obj;
        return state == traversalResult.state && Objects.equals(trace, traversalResult.trace);
    }
}
