using System;

public class BinaryIO {
    public static long Feature(long seed, long value) {
        long result = 38%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 38;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=BinaryIO tier=12 seed=38 result=" + Feature(38, value));
    }
}
