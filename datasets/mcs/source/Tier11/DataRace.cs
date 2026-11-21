using System;

public class DataRace {
    public static long Feature(long seed, long value) {
        long result = 1+(96%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 96;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DataRace tier=11 seed=96 result=" + Feature(96, value));
    }
}
