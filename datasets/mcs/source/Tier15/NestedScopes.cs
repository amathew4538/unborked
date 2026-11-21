using System;

public class NestedScopes {
    public static long Feature(long seed, long value) {
        long result = 100/((29%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 29;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=NestedScopes tier=15 seed=29 result=" + Feature(29, value));
    }
}
