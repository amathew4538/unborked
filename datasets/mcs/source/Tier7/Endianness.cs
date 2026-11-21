using System;

public class Endianness {
    public static long Feature(long seed, long value) {
        long result = (0%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 0;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Endianness tier=7 seed=0 result=" + Feature(0, value));
    }
}
