using System;

public class ConstantExpression {
    public static long Feature(long seed, long value) {
        long result = 100/((28%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 28;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ConstantExpression tier=15 seed=28 result=" + Feature(28, value));
    }
}
