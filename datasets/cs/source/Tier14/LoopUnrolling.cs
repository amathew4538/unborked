using System;

public class LoopUnrolling {
    public static long Feature(long seed, long value) {
        long result = (16*(16+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 16;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=LoopUnrolling tier=14 seed=16 result=" + Feature(16, value));
    }
}
