import java.util.*;

public class ConstantFolding {
    public static long feature(long seed, long value) {
        long result = (4*(4+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 4;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ConstantFolding tier=14 seed=4 result=%d%%n", feature(4, value));
    }
}
