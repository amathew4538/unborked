using System;

public class MultipleReturnValues {
    public static long Feature(long seed, long value) {
        long result = 3+((3%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 3;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=MultipleReturnValues tier=8 seed=3 result=" + Feature(3, value));
    }
}
