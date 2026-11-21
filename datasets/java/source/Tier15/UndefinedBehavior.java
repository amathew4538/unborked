import java.util.*;

public class UndefinedBehavior {
    public static long feature(long seed, long value) {
        long result = 100/((37%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 37;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=UndefinedBehavior tier=15 seed=37 result=%d%%n", feature(37, value));
    }
}
