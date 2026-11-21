using System;

public class BranchlessOperations {
    public static long Feature(long seed, long value) {
        long result = (92*(92+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 92;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=BranchlessOperations tier=14 seed=92 result=" + Feature(92, value));
    }
}
