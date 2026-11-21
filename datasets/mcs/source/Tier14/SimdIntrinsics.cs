using System;

public class SimdIntrinsics {
    public static long Feature(long seed, long value) {
        long result = (81*(81+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 81;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=SimdIntrinsics tier=14 seed=81 result=" + Feature(81, value));
    }
}
