using System;

public class PassByReference {
    public static long Feature(long seed, long value) {
        long result = (20%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 20;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=PassByReference tier=7 seed=20 result=" + Feature(20, value));
    }
}
