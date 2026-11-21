using System;

public class Mutex {
    public static long Feature(long seed, long value) {
        long result = 1+(14%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 14;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Mutex tier=11 seed=14 result=" + Feature(14, value));
    }
}
