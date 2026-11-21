using System;

public class VectorOperations {
    public static long Feature(long seed, long value) {
        long result = (7*(7+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 7;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=VectorOperations tier=14 seed=7 result=" + Feature(7, value));
    }
}
