using System;

public class Callback {
    public static long Feature(long seed, long value) {
        long result = 49+((49%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 49;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Callback tier=8 seed=49 result=" + Feature(49, value));
    }
}
