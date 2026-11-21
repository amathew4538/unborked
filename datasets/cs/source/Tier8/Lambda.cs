using System;

public class Lambda {
    public static long Feature(long seed, long value) {
        long result = 34+((34%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 34;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Lambda tier=8 seed=34 result=" + Feature(34, value));
    }
}
