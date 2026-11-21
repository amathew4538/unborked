using System;

public class Spinlock {
    public static long Feature(long seed, long value) {
        long result = 1+(34%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 34;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Spinlock tier=11 seed=34 result=" + Feature(34, value));
    }
}
