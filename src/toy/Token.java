package toy;

public abstract class Token {
    public static final Token EOF = new Token(-1) {
    };
    public static final String EOL = "\\n";

    private int lineNUmber;

    protected Token(int line) {
        lineNUmber = line;
    }

    public int getLineNUmber() {
        return lineNUmber;
    }

    public boolean isIdentifier() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public int getNumber() {
        throw new StoneException("not number token");
    }

    public String getText() {
        return "";
    }
}
