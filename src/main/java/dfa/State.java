package dfa;

import java.util.HashMap;
import java.util.Map;

public class State {

    private final String id;
    private final boolean finite;
    private String name;
    private final Map<Character, State> transition;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTransition(Character symbol, State nextState) {
        this.transition.put(symbol, nextState);
    }

    public State getTransition(Character symbol) {
        return transition.get(symbol);
    }

    public boolean hasTransition(Character symbol) {
        if (this.transition.get(symbol) == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("State: %s, type: %s", id, name);
    }
}
