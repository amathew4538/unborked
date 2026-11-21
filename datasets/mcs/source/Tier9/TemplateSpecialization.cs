using System;

public class TemplateSpecialization {
    public static long Feature(long seed, long value) {
        long result = (95%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 95;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=TemplateSpecialization tier=9 seed=95 result=" + Feature(95, value));
    }
}
