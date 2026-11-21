using System;

public class RegisterSpilling {
    public static long Feature(long seed, long value) {
        long result = (37*(37+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 37;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=RegisterSpilling tier=14 seed=37 result=" + Feature(37, value));
    }
}
