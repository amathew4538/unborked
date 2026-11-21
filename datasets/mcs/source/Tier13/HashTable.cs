using System;

public class HashTable {
    public static long Feature(long seed, long value) {
        long result = (26%64)*(26%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 26;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=HashTable tier=13 seed=26 result=" + Feature(26, value));
    }
}
