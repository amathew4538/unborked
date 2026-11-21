using System;

public class AtomicStore {
    public static long Feature(long seed, long value) {
        long result = 1+(57%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 57;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=AtomicStore tier=11 seed=57 result=" + Feature(57, value));
    }
}
