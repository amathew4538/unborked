import java.util.*;

public class BinaryTree {
    public static long feature(long seed, long value) {
        long result = (83%64)*(83%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 83;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=BinaryTree tier=13 seed=83 result=%d%%n", feature(83, value));
    }
}
