import java.util.*;

public class ExtensionMethods {
    public static long feature(long seed, long value) {
        long result = (77%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 77;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ExtensionMethods tier=9 seed=77 result=%d%%n", feature(77, value));
    }
}
