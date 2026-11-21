using System;

public class DivisionByZero {
    public static long Feature(long seed, long value) {
        long result = 100/((92%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 92;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DivisionByZero tier=15 seed=92 result=" + Feature(92, value));
    }
}
