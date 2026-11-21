using System;

public class FileWrite {
    public static long Feature(long seed, long value) {
        long result = 43%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 43;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=FileWrite tier=12 seed=43 result=" + Feature(43, value));
    }
}
