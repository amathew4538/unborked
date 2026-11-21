using System;
public class SharedLibrary
{
    public static void Main(string[] args)
    {
        int sum = 0; foreach (var arg in args) { if (int.TryParse(arg, out int n)) sum += n; }
        Console.WriteLine("feature=SharedLibrary args=" + args.Length + " sum=" + sum);
    }
}
