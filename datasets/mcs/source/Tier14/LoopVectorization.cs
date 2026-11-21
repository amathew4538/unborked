using System;

public class LoopVectorization {
    public static long Feature(long seed, long value) {
        long result = (13*(13+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 13;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=LoopVectorization tier=14 seed=13 result=" + Feature(13, value));
    }
}
