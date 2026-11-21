using System;

public class InstanceFields {
    public static long Feature(long seed, long value) {
        long result = (75%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 75;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=InstanceFields tier=9 seed=75 result=" + Feature(75, value));
    }
}
