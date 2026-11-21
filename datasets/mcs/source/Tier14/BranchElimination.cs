using System;

public class BranchElimination {
    public static long Feature(long seed, long value) {
        long result = (5*(5+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 5;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=BranchElimination tier=14 seed=5 result=" + Feature(5, value));
    }
}
