using System;

public class Generator {
    public static long Feature(long seed, long value) {
        long result = 35+((35%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 35;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Generator tier=8 seed=35 result=" + Feature(35, value));
    }
}
