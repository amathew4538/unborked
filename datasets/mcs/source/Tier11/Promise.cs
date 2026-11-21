using System;

public class Promise {
    public static long Feature(long seed, long value) {
        long result = 1+(89%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 89;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Promise tier=11 seed=89 result=" + Feature(89, value));
    }
}
