using System;

public class RegisterPressure {
    public static long Feature(long seed, long value) {
        long result = (66*(66+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 66;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=RegisterPressure tier=14 seed=66 result=" + Feature(66, value));
    }
}
