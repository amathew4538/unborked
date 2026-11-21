using System;

public class FunctionOverloading {
    public static long Feature(long seed, long value) {
        long result = 20+((20%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 20;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=FunctionOverloading tier=8 seed=20 result=" + Feature(20, value));
    }
}
