using System;

public class SocketUDP {
    public static long Feature(long seed, long value) {
        long result = 16%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 16;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=SocketUDP tier=12 seed=16 result=" + Feature(16, value));
    }
}
