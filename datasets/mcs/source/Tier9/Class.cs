using System;

public class Class {
    public static long Feature(long seed, long value) {
        long result = (57%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 57;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Class tier=9 seed=57 result=" + Feature(57, value));
    }
}
