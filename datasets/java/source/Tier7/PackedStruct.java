import java.util.*;

public class PackedStruct {
    public static long feature(long seed, long value) {
        long result = (45%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 45;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=PackedStruct tier=7 seed=45 result=%d%%n", feature(45, value));
    }
}
