import java.util.*;

public class StaticMethods {
    public static long feature(long seed, long value) {
        long result = (30%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 30;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=StaticMethods tier=9 seed=30 result=%d%%n", feature(30, value));
    }
}
