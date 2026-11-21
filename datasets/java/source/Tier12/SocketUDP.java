import java.util.*;

public class SocketUDP {
    public static long feature(long seed, long value) {
        long result = 16%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 16;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=SocketUDP tier=12 seed=16 result=%d%%n", feature(16, value));
    }
}
