using System;

public class NestedStruct {
    public static long Feature(long seed, long value) {
        long result = (38%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 38;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=NestedStruct tier=7 seed=38 result=" + Feature(38, value));
    }
}
