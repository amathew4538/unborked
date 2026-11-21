using System;

public class NetworkClient {
    public static long Feature(long seed, long value) {
        long result = 83%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 83;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=NetworkClient tier=12 seed=83 result=" + Feature(83, value));
    }
}
