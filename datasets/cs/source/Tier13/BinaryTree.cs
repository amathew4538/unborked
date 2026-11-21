using System;

public class BinaryTree {
    public static long Feature(long seed, long value) {
        long result = (83%64)*(83%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 83;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=BinaryTree tier=13 seed=83 result=" + Feature(83, value));
    }
}
