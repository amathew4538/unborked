using System;

public class Constructor {
    public static long Feature(long seed, long value) {
        long result = (87%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 87;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Constructor tier=9 seed=87 result=" + Feature(87, value));
    }
}
