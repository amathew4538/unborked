using System;

public class Goto {
    public static long Feature(long seed, long value) {
        long result = 18+((18%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 18;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Goto tier=8 seed=18 result=" + Feature(18, value));
    }
}
