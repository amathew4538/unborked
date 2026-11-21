using System;

public class Stack {
    public static long Feature(long seed, long value) {
        long result = (82%64)*(82%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 82;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Stack tier=13 seed=82 result=" + Feature(82, value));
    }
}
