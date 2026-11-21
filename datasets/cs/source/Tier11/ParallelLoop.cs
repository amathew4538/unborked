using System;

public class ParallelLoop {
    public static long Feature(long seed, long value) {
        long result = 1+(71%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 71;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ParallelLoop tier=11 seed=71 result=" + Feature(71, value));
    }
}
