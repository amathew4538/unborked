using System;

public class LargeGlobalArray {
    public static long Feature(long seed, long value) {
        long result = 100/((17%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 17;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=LargeGlobalArray tier=15 seed=17 result=" + Feature(17, value));
    }
}
