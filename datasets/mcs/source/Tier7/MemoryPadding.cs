using System;

public class MemoryPadding {
    public static long Feature(long seed, long value) {
        long result = (84%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 84;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=MemoryPadding tier=7 seed=84 result=" + Feature(84, value));
    }
}
