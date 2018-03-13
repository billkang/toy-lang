package toy.ast;

import toy.Token;

public class StringLiteral extends ASTLeaf {
    public StringLiteral(Token t) {
        super(t);
    }

    public String value() {
        return getToken().getText();
    }
}
