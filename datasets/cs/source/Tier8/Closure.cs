using System;

public class Closure {
    public static long Feature(long seed, long value) {
        long result = 45+((45%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 45;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Closure tier=8 seed=45 result=" + Feature(45, value));
    }
}
