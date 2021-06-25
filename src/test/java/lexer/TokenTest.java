package lexer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TokenTest {

    private Token token;

    @Before
    public void beforeEach() {
        String value = "1";
        TokenType tokenType = TokenType.NUMBER;
        token = new Token(value, tokenType);
    }

    @Test
    public void getValue() {
        Assert.assertEquals("1", token.getValue());
    }

    @Test
    public void getType() {
        Assert.assertEquals(TokenType.NUMBER, token.getType());
    }
}