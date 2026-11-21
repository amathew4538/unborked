using System;

public class InlineAssembly {
    public static long Feature(long seed, long value) {
        long result = (28*(28+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 28;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=InlineAssembly tier=14 seed=28 result=" + Feature(28, value));
    }
}
