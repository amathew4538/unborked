using System;

public class Dijkstra {
    public static long Feature(long seed, long value) {
        long result = (86%64)*(86%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 86;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Dijkstra tier=13 seed=86 result=" + Feature(86, value));
    }
}
