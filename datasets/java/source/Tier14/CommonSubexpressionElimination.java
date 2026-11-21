import java.util.*;

public class CommonSubexpressionElimination {
    public static long feature(long seed, long value) {
        long result = (52*(52+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 52;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=CommonSubexpressionElimination tier=14 seed=52 result=%d%%n", feature(52, value));
    }
}
