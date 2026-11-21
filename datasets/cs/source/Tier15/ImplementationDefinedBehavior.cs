using System;

public class ImplementationDefinedBehavior {
    public static long Feature(long seed, long value) {
        long result = 100/((7%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 7;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ImplementationDefinedBehavior tier=15 seed=7 result=" + Feature(7, value));
    }
}
