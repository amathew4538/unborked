using System;

public class ClosureCapture {
    public static long Feature(long seed, long value) {
        long result = 2+((2%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 2;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ClosureCapture tier=8 seed=2 result=" + Feature(2, value));
    }
}
