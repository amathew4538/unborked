using System;
public class ReturnValueConvention
{
    public static void Main(string[] args)
    {
        int sum = 0; foreach (var arg in args) { if (int.TryParse(arg, out int n)) sum += n; }
        Console.WriteLine("feature=ReturnValueConvention args=" + args.Length + " sum=" + sum);
    }
}
