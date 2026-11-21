using System;

public class GenericConstraints {
    public static long Feature(long seed, long value) {
        long result = (76%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 76;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=GenericConstraints tier=9 seed=76 result=" + Feature(76, value));
    }
}
