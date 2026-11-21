import java.util.*;

public class DataRace {
    public static long feature(long seed, long value) {
        long result = 1+(96%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 96;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=DataRace tier=11 seed=96 result=%d%%n", feature(96, value));
    }
}
