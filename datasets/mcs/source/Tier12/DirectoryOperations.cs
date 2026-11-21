using System;

public class DirectoryOperations {
    public static long Feature(long seed, long value) {
        long result = 72%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 72;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DirectoryOperations tier=12 seed=72 result=" + Feature(72, value));
    }
}
