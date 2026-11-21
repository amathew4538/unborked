using System;

public class LargeStackFrame {
    public static long Feature(long seed, long value) {
        long result = 100/((85%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 85;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=LargeStackFrame tier=15 seed=85 result=" + Feature(85, value));
    }
}
