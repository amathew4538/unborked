import java.util.*;

public class Serialization {
    public static long feature(long seed, long value) {
        long result = (44%64)*(44%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 44;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Serialization tier=13 seed=44 result=%d%%n", feature(44, value));
    }
}
