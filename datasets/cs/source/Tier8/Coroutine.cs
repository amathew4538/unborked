using System;

public class Coroutine {
    public static long Feature(long seed, long value) {
        long result = 30+((30%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 30;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Coroutine tier=8 seed=30 result=" + Feature(30, value));
    }
}
