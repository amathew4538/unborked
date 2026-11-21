using System;

public class CharacterTypes {
    public static long Feature(long seed, long value) {
        long result = 30*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 30;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=CharacterTypes tier=6 seed=30 result=" + Feature(30, value));
    }
}
