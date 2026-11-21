import java.util.*;

public class ProducerConsumer {
    public static long feature(long seed, long value) {
        long result = 1+(75%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 75;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ProducerConsumer tier=11 seed=75 result=%d%%n", feature(75, value));
    }
}
