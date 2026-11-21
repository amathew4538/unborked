using System;

public class NameMangling {
    public static long Feature(long seed, long value) {
        long result = (78%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 78;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=NameMangling tier=9 seed=78 result=" + Feature(78, value));
    }
}
