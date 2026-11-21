using System;

public class SignedOverflow {
    public static long Feature(long seed, long value) {
        long result = 100/((65%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 65;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=SignedOverflow tier=15 seed=65 result=" + Feature(65, value));
    }
}
