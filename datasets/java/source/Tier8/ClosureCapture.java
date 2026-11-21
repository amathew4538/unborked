import java.util.*;

public class ClosureCapture {
    public static long feature(long seed, long value) {
        long result = 2+((2%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 2;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ClosureCapture tier=8 seed=2 result=%d%%n", feature(2, value));
    }
}
