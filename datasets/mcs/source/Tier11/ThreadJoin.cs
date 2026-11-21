using System;

public class ThreadJoin {
    public static long Feature(long seed, long value) {
        long result = 1+(45%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 45;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ThreadJoin tier=11 seed=45 result=" + Feature(45, value));
    }
}
