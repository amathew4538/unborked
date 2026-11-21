using System;

public class FileMetadata {
    public static long Feature(long seed, long value) {
        long result = 40%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 40;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=FileMetadata tier=12 seed=40 result=" + Feature(40, value));
    }
}
