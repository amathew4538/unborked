import java.util.*;

public class Pipe {
    public static long feature(long seed, long value) {
        long result = 60%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 60;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Pipe tier=12 seed=60 result=%d%%n", feature(60, value));
    }
}
