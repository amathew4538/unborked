using System;

public class GraphDFS {
    public static long Feature(long seed, long value) {
        long result = (16%64)*(16%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 16;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=GraphDFS tier=13 seed=16 result=" + Feature(16, value));
    }
}
