using System;

public class TailCall {
    public static long Feature(long seed, long value) {
        long result = 70+((70%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 70;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=TailCall tier=8 seed=70 result=" + Feature(70, value));
    }
}
