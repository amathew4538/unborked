using System;

public class GraphBFS {
    public static long Feature(long seed, long value) {
        long result = (4%64)*(4%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 4;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=GraphBFS tier=13 seed=4 result=" + Feature(4, value));
    }
}
