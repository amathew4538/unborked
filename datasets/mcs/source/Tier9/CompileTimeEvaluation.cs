using System;

public class CompileTimeEvaluation {
    public static long Feature(long seed, long value) {
        long result = (83%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 83;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=CompileTimeEvaluation tier=9 seed=83 result=" + Feature(83, value));
    }
}
