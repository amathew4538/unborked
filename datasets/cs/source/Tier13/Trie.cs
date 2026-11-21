using System;

public class Trie {
    public static long Feature(long seed, long value) {
        long result = (61%64)*(61%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 61;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Trie tier=13 seed=61 result=" + Feature(61, value));
    }
}
