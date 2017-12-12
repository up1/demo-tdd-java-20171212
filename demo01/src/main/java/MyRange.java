public class MyRange {

    public static final int ASCII_ZERO = 48;

    public String of(String input) {
        String result = "";
        for(int i=getBegin(input); i<= getEnd(input); i++ ) {
            result += i;
        }
        return result;
    }

    private int getEnd(String input) {
        return 0;
    }

    public boolean startWithInclude(String input) {
        return input.startsWith("[");
    }

    public boolean endWithInclude(String input) {
        return input.endsWith("]");
    }

    public int getBegin(String input) {
        if (startWithInclude(input)) {
            return input.charAt(1) - ASCII_ZERO;
        }
        return input.charAt(1) - 47;
    }
}
