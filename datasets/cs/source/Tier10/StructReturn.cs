using System;

public class StructReturn {
    public static long Feature(long seed, long value) {
        long result = 47+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 47;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StructReturn tier=10 seed=47 result=" + Feature(47, value));
    }
}
