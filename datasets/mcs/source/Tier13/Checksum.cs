using System;

public class Checksum {
    public static long Feature(long seed, long value) {
        long result = (10%64)*(10%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 10;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Checksum tier=13 seed=10 result=" + Feature(10, value));
    }
}
