using System;

public class SignalHandling {
    public static long Feature(long seed, long value) {
        long result = 95%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 95;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=SignalHandling tier=12 seed=95 result=" + Feature(95, value));
    }
}
