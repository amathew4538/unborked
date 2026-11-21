using System;

public class ArrayLayout {
    public static long Feature(long seed, long value) {
        long result = (95%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 95;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ArrayLayout tier=7 seed=95 result=" + Feature(95, value));
    }
}
