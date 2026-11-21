using System;

public class DoubleFree {
    public static long Feature(long seed, long value) {
        long result = 100/((68%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 68;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DoubleFree tier=15 seed=68 result=" + Feature(68, value));
    }
}
