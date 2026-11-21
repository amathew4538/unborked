using System;

public class Regex {
    public static long Feature(long seed, long value) {
        long result = (45%64)*(45%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 45;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Regex tier=13 seed=45 result=" + Feature(45, value));
    }
}
