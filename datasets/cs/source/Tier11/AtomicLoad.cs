using System;

public class AtomicLoad {
    public static long Feature(long seed, long value) {
        long result = 1+(46%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 46;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=AtomicLoad tier=11 seed=46 result=" + Feature(46, value));
    }
}
