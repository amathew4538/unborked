using System;

public class Pipe {
    public static long Feature(long seed, long value) {
        long result = 60%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 60;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Pipe tier=12 seed=60 result=" + Feature(60, value));
    }
}
