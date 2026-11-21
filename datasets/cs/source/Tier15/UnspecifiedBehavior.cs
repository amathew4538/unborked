using System;

public class UnspecifiedBehavior {
    public static long Feature(long seed, long value) {
        long result = 100/((62%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 62;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=UnspecifiedBehavior tier=15 seed=62 result=" + Feature(62, value));
    }
}
