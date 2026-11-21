import java.util.*;

public class Endianness {
    public static long feature(long seed, long value) {
        long result = (0%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 0;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Endianness tier=7 seed=0 result=%d%%n", feature(0, value));
    }
}
