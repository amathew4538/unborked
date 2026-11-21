using System;
public class TailCall
{
    public static void Main(string[] args)
    {
        int sum = 0; foreach (var arg in args) { if (int.TryParse(arg, out int n)) sum += n; }
        Console.WriteLine("feature=TailCall args=" + args.Length + " sum=" + sum);
    }
}
