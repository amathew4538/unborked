using System;
public class ExceptionUnwinding
{
    public static void Main(string[] args)
    {
        int sum = 0; foreach (var arg in args) { if (int.TryParse(arg, out int n)) sum += n; }
        Console.WriteLine("feature=ExceptionUnwinding args=" + args.Length + " sum=" + sum);
    }
}
