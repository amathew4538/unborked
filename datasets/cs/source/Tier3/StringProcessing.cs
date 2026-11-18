using System;
using System.IO;
using System.Linq;

namespace Tier3
{
    class StringProcessing
    {
        static void Main() {
            string input = "Hello World!";
            Console.WriteLine("upper: " + input.ToUpperInvariant());
            Console.WriteLine("reverse: " + new string(input.Reverse().ToArray()));
            Console.WriteLine("words: " + input.Split().Length);
        }
    }
}
