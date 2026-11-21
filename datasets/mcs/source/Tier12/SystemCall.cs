using System;

public class SystemCall {
    public static long Feature(long seed, long value) {
        long result = 61%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 61;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=SystemCall tier=12 seed=61 result=" + Feature(61, value));
    }
}
