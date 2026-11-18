using System;

namespace Tier1 {
    class Recursion {
        static int Factorial(int n) {
            return n <= 1 ? 1 : n * Factorial(n - 1);
        }

        static void Main(string[] args) {
            Console.WriteLine(Factorial(5));
        }
    }
}
