package DFA;

import lexicalAnalyzer.Token;
import lexicalAnalyzer.TokenType;

import java.util.HashMap;
import java.util.Map;

public class State {

    private final String id;
    private final boolean finite;
    private final Map<Character, State> transition;
    private TokenType type;

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
        if (this.transition.get(symbol) == null) {
            return false;
        }
        return true;
    }
}
