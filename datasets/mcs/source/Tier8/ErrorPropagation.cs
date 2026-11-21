using System;

public class ErrorPropagation {
    public static long Feature(long seed, long value) {
        long result = 44+((44%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 44;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ErrorPropagation tier=8 seed=44 result=" + Feature(44, value));
    }
}
