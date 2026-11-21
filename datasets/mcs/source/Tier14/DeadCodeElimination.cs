using System;

public class DeadCodeElimination {
    public static long Feature(long seed, long value) {
        long result = (32*(32+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 32;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DeadCodeElimination tier=14 seed=32 result=" + Feature(32, value));
    }
}
