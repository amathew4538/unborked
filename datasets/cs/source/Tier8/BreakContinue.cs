using System;

public class BreakContinue {
    public static long Feature(long seed, long value) {
        long result = 94+((94%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 94;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=BreakContinue tier=8 seed=94 result=" + Feature(94, value));
    }
}
