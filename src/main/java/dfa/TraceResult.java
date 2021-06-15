package dfa;

public class TraceResult {

    private final State state;
    private final String name;

    public TraceResult(State state, String name) {
        this.state = state;
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public String getName() {
        return name;
    }
}
