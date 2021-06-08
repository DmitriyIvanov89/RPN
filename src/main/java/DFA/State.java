package DFA;

import java.util.HashMap;
import java.util.Map;

public class State {

    private final String id;
    private final boolean finite;
    private String type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addTransition(Character symbol, State nextState) {
        this.transition.put(symbol, nextState);
    }

    public State getTransition(Character symbol) {
        return transition.get(symbol);
    }

    public boolean hasTransition(Character symbol) {
<<<<<<< HEAD
<<<<<<< HEAD
        if (transition.get(symbol) == null) {
=======
        if (this.transition.get(symbol) == null) {
>>>>>>> 63e5c70e6a1c6318dd5f012522c82e18b20f514d
=======
        if (this.transition.get(symbol) != null) {
            return true;
        } else {
>>>>>>> 3674e06d7b963cd7fd66ed8648a598ef27c9f38b
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("State: %s, type: %s", id, type);
    }
}
