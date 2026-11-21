using System;

public class MemoryFence {
    public static long Feature(long seed, long value) {
        long result = 1+(42%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 42;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=MemoryFence tier=11 seed=42 result=" + Feature(42, value));
    }
}
