using System;

public class Constants {
    public static long Feature(long seed, long value) {
        long result = 27*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 27;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Constants tier=6 seed=27 result=" + Feature(27, value));
    }
}
