using System;

public class Graph {
    public static long Feature(long seed, long value) {
        long result = (6%64)*(6%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 6;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Graph tier=13 seed=6 result=" + Feature(6, value));
    }
}
