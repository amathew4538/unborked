using System;

public class ConstantFolding {
    public static long Feature(long seed, long value) {
        long result = (4*(4+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 4;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ConstantFolding tier=14 seed=4 result=" + Feature(4, value));
    }
}
