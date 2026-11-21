using System;

namespace Tier1
{
    class Conditional
    {
        static string Classify(int n)
        {
            if (n < 0) return "negative";
            if (n > 0) return "positive";
            return "zero";
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Classify(-1));
            Console.WriteLine(Classify(0));
            Console.WriteLine(Classify(1));
        }
    }
}
