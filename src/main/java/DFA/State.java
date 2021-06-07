package DFA;

import lexicalAnalyzer.Token;
import lexicalAnalyzer.TokenType;

import java.util.HashMap;
import java.util.Map;

public class State {

    private final String id;
    private final boolean finite;
    private final TokenType type;
    private final Map<Character, State> transition;

    public State(String id, boolean finite) {
        this.id = id;
        this.finite = finite;
        this.type = getType();
        this.transition = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public boolean isFinite() {
        return finite;
    }

    public TokenType getType() {
        return type;
    }

    public void addTransition(Character symbol, State nextState) {
        this.transition.put(symbol, nextState);
    }

    public State getTransition(Character symbol) {
        return transition.get(symbol);
    }

    public boolean hasTransition(Character symbol) {
<<<<<<< HEAD
        if (transition.get(symbol) == null) {
=======
        if (this.transition.get(symbol) == null) {
>>>>>>> 63e5c70e6a1c6318dd5f012522c82e18b20f514d
            return false;
        }
        return true;
    }
}
