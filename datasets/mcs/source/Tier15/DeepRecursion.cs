using System;

public class DeepRecursion {
    public static long Feature(long seed, long value) {
        long result = 100/((59%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 59;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DeepRecursion tier=15 seed=59 result=" + Feature(59, value));
    }
}
