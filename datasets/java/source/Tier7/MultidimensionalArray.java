import java.util.*;

public class MultidimensionalArray {
    public static int parseArg(String[] args, int fallback) {
        if(args.length>0) try { return Integer.parseInt(args[0]); } catch(NumberFormatException ignored) {}
        return fallback;
    }
    public static int parse(String text) { try { return Integer.parseInt(text); } catch(NumberFormatException ignored) { return 7; } }

    public static void main(String[] args) {
        int[] values={10,20,30,40};
        int value=args.length>0?parse(args[0]):20;
        int index=(value/10)%values.length;
        if(index<0) index+=values.length;
        System.out.printf("feature=MultidimensionalArray tier=7 heap-index=%d heap-value=%d%n", index, values[index]);
    }
}
