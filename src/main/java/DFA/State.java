package DFA;

import java.util.HashMap;
import java.util.Map;

public class State {

    private String id;
    private boolean finite;
    private Map<Character, State> transition;

    public State(String id, boolean finite) {
        this.id = id;
        this.finite = finite;
        this.transition = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public boolean isFinite() {
        return finite;
    }

    public void addTransition(Character symbol, State nextState) {
        this.transition.put(symbol, nextState);
    }

    public State getTransition(Character symbol) {
        return transition.get(symbol);
    }
}
