using System;

public class TailCallOptimization {
    public static long Feature(long seed, long value) {
        long result = (59*(59+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 59;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=TailCallOptimization tier=14 seed=59 result=" + Feature(59, value));
    }
}
