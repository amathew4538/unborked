using System;

public class CommandLineArguments {
    public static long Feature(long seed, long value) {
        long result = 46%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 46;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=CommandLineArguments tier=12 seed=46 result=" + Feature(46, value));
    }
}
