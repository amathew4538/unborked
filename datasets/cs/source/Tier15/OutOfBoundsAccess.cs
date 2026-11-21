using System;

public class OutOfBoundsAccess {
    public static long Feature(long seed, long value) {
        long result = 100/((94%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 94;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=OutOfBoundsAccess tier=15 seed=94 result=" + Feature(94, value));
    }
}
