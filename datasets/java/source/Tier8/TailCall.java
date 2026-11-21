import java.util.*;

public class TailCall {
    public static long feature(long seed, long value) {
        long result = 70+((70%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 70;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=TailCall tier=8 seed=70 result=%d%%n", feature(70, value));
    }
}
