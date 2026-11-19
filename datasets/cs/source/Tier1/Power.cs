using System;
namespace Tier1
{
    class Power
    {
        static int PowerFunc(int a, int b) {
            int result = 1;

            for (int i = 0; i < b; i++) {
                result *= a;
            }

            return result;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(PowerFunc(2, 8));
            Console.WriteLine(PowerFunc(3, 4));
        }
    }
}
