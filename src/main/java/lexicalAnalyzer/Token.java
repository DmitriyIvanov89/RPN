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
        return String.format("Token value: %s, token type: %s", value, type);
    }
}