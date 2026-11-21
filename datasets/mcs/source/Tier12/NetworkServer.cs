using System;

public class NetworkServer {
    public static long Feature(long seed, long value) {
        long result = 0%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 0;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=NetworkServer tier=12 seed=0 result=" + Feature(0, value));
    }
}
