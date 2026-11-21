import java.util.*;

public class ObjectConstruction {
    public static int feature(int value) { return value*value+3; }
    public static int parseArg(String[] args, int fallback) {
        if(args.length>0) try { return Integer.parseInt(args[0]); } catch(NumberFormatException ignored) {}
        return fallback;
    }
    public static int parse(String text) { try { return Integer.parseInt(text); } catch(NumberFormatException ignored) { return 7; } }

    public static void main(String[] args) {
        int value=parseArg(args,7);
        System.out.printf("feature=ObjectConstruction tier=9 method=%s result=%d%n", "feature", feature(value));
    }
}
