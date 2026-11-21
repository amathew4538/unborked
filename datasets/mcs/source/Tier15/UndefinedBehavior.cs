using System;

public class UndefinedBehavior {
    public static long Feature(long seed, long value) {
        long result = 100/((37%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 37;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=UndefinedBehavior tier=15 seed=37 result=" + Feature(37, value));
    }
}
