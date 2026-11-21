import java.util.*;

public class FunctionPointer {
    public static int parseArg(String[] args, int fallback) {
        if(args.length>0) try { return Integer.parseInt(args[0]); } catch(NumberFormatException ignored) {}
        return fallback;
    }
    public static int parse(String text) { try { return Integer.parseInt(text); } catch(NumberFormatException ignored) { return 7; } }

    public static void main(String[] args) {
        int value=args.length>0?parse(args[0]):7;
        java.util.function.IntUnaryOperator transform=x -> x*x+3;
        int result=transform.applyAsInt(value);
        System.out.printf("feature=FunctionPointer tier=8 result=%d%n", result);
    }
}
