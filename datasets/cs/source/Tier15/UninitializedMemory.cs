using System;

public class UninitializedMemory {
    public static long Feature(long seed, long value) {
        long result = 100/((67%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 67;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=UninitializedMemory tier=15 seed=67 result=" + Feature(67, value));
    }
}
