package lexicalAnalyzer;

import DFA.*;

import java.io.IOException;

public class Lexer {

    private final String expr;
    private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    private State currState;
    private Token currToken;
    private String value;

    public Lexer(String expr) throws IOException {
        this.expr = expr;
        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();
        DFA dfa = new DFA(config);
    }

    public Token getNextToken() {
        return null;
    }

    public Token lookAHead() {
        return null;
    }
}
