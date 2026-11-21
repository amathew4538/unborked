using System;

public class LinkedList {
    public static long Feature(long seed, long value) {
        long result = (90%64)*(90%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 90;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=LinkedList tier=13 seed=90 result=" + Feature(90, value));
    }
}
