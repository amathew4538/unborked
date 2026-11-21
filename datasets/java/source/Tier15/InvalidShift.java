import java.util.*;

public class InvalidShift {
    public static int parseArg(String[] args, int fallback) {
        if(args.length>0) try { return Integer.parseInt(args[0]); } catch(NumberFormatException ignored) {}
        return fallback;
    }
    public static int parse(String text) { try { return Integer.parseInt(text); } catch(NumberFormatException ignored) { return 7; } }

    public static void main(String[] args) {
        int divisor=args.length>0?parse(args[0]):4;
        if(divisor==0) {{ System.out.printf("feature=InvalidShift tier=15 error=division-by-zero%n"); return; }}
        System.out.printf("feature=InvalidShift tier=15 quotient=%d%n", 100/divisor);
    }
}
