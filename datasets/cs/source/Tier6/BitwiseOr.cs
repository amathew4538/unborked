using System;
public class BitwiseOr
{
    public static void Main(string[] args)
    {
        int sum = 0; foreach (var arg in args) { if (int.TryParse(arg, out int n)) sum += n; }
        Console.WriteLine("feature=BitwiseOr args=" + args.Length + " sum=" + sum);
    }
}
