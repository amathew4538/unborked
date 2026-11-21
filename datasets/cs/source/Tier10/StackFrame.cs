using System;

public class StackFrame {
    public static long Feature(long seed, long value) {
        long result = 90+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 90;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StackFrame tier=10 seed=90 result=" + Feature(90, value));
    }
}
