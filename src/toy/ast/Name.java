package toy.ast;

import toy.Token;

public class Name extends ASTLeaf {
    public Name(Token t) {
        super(t);
    }

    public String name() {
        return getToken().getText();
    }
}
