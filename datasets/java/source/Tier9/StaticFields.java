import java.util.*;

public class StaticFields {
    public static long feature(long seed, long value) {
        long result = (34%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 34;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=StaticFields tier=9 seed=34 result=%d%%n", feature(34, value));
    }
}
