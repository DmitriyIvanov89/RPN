package lexicalAnalyzer;

public class Token {

    private final String value;
    private final TokenType type;

    public Token(String value, TokenType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public TokenType getType() {
        return type;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return String.format("Token type: %s, value: %s", type, value);
=======
        return String.format("Token value: %s, type: %s", value, type);
>>>>>>> 63e5c70e6a1c6318dd5f012522c82e18b20f514d
    }
}
