import java.util.*;

public class SocketTCP {
    public static long feature(long seed, long value) {
        long result = 1%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 1;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=SocketTCP tier=12 seed=1 result=%d%%n", feature(1, value));
    }
}
