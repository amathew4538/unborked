import java.util.*;

public class WideningConversion {
    public static int parseArg(String[] args, int fallback) {
        if(args.length>0) try { return Integer.parseInt(args[0]); } catch(NumberFormatException ignored) {}
        return fallback;
    }
    public static int parse(String text) { try { return Integer.parseInt(text); } catch(NumberFormatException ignored) { return 7; } }

    public static void main(String[] args) {
        int[] widths={8,16,32,64};
        long mask=(1L << widths[2]) - 1L;
        long value=args.length>0?parse(args[0]):-42L;
        System.out.printf("feature=WideningConversion tier=6 value=%d masked=%d%n", value, value & mask);
    }
}
