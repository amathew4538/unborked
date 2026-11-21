using System;

public class ThreadLocalStorage {
    public static long Feature(long seed, long value) {
        long result = 21+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 21;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ThreadLocalStorage tier=10 seed=21 result=" + Feature(21, value));
    }
}
