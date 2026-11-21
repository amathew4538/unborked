using System;

public class NullDereference {
    public static long Feature(long seed, long value) {
        long result = 100/((26%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 26;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=NullDereference tier=15 seed=26 result=" + Feature(26, value));
    }
}
