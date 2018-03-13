package toy.ast;

import java.util.Iterator;
import java.util.ArrayList;
import toy.Token;

public class ASTLeaf extends ASTree {
    private static ArrayList<ASTree> empty = new ArrayList<ASTree>();
    protected Token token;

    public ASTLeaf(Token t) {
        token = t;
    }

    public ASTree child(int i) {
        throw new IndexOutOfBoundsException();
    }

    public int numChildren() {
        return 0;
    }

    public Iterator<ASTree> children() {
        return empty.iterator();
    }

    public String toString() {
        return token.getText();
    }

    public String location() {
        return "at line " + token.getLineNUmber();
    }

    public Token getToken() {
        return token;
    }
}
