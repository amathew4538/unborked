using System;

public class ConditionVariable {
    public static long Feature(long seed, long value) {
        long result = 1+(72%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 72;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ConditionVariable tier=11 seed=72 result=" + Feature(72, value));
    }
}
