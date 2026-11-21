using System;

public class UseAfterFree {
    public static long Feature(long seed, long value) {
        long result = 100/((36%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 36;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=UseAfterFree tier=15 seed=36 result=" + Feature(36, value));
    }
}
