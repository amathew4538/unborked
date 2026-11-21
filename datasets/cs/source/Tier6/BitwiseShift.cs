using System;
public class BitwiseShift
{
    public static void Main(string[] args)
    {
        int sum = 0; foreach (var arg in args) { if (int.TryParse(arg, out int n)) sum += n; }
        Console.WriteLine("feature=BitwiseShift args=" + args.Length + " sum=" + sum);
    }
}
