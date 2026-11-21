using System;
public class Goto
{
    public static void Main(string[] args)
    {
        int sum = 0; foreach (var arg in args) { if (int.TryParse(arg, out int n)) sum += n; }
        Console.WriteLine("feature=Goto args=" + args.Length + " sum=" + sum);
    }
}
