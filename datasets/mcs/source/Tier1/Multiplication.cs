using System;
namespace Tier1
{
    class Multiplication
    {
        static int Multiply(int a, int b) {
            return a * b;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Multiply(0, 1));
            Console.WriteLine(Multiply(7, 13));
            Console.WriteLine(Multiply(65536, 1000));
            Console.WriteLine(Multiply(64, 8));
            Console.WriteLine(Multiply(-42, -1));
        }
    }
}
