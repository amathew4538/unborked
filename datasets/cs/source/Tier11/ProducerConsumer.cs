using System;

public class ProducerConsumer {
    public static long Feature(long seed, long value) {
        long result = 1+(75%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 75;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ProducerConsumer tier=11 seed=75 result=" + Feature(75, value));
    }
}
