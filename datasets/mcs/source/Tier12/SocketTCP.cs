using System;

public class SocketTCP {
    public static long Feature(long seed, long value) {
        long result = 1%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 1;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=SocketTCP tier=12 seed=1 result=" + Feature(1, value));
    }
}
