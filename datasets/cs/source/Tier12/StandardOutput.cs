using System;

public class StandardOutput {
    public static long Feature(long seed, long value) {
        long result = 23%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 23;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StandardOutput tier=12 seed=23 result=" + Feature(23, value));
    }
}
