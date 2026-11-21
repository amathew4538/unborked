using System;

public class ExceptionUnwinding {
    public static long Feature(long seed, long value) {
        long result = 37+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 37;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ExceptionUnwinding tier=10 seed=37 result=" + Feature(37, value));
    }
}
