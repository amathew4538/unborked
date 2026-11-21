using System;

public class ThreadLocalVariables {
    public static long Feature(long seed, long value) {
        long result = 1+(0%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 0;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ThreadLocalVariables tier=11 seed=0 result=" + Feature(0, value));
    }
}
