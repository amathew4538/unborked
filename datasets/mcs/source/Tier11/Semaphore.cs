using System;

public class Semaphore {
    public static long Feature(long seed, long value) {
        long result = 1+(29%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 29;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Semaphore tier=11 seed=29 result=" + Feature(29, value));
    }
}
