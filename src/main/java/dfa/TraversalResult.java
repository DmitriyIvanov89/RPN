package dfa;

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
}
