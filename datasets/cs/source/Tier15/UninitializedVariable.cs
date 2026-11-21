using System;

public class UninitializedVariable {
    public static long Feature(long seed, long value) {
        long result = 100/((60%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 60;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=UninitializedVariable tier=15 seed=60 result=" + Feature(60, value));
    }
}
