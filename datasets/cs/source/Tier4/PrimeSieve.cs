using System;
using System.IO;
using System.Linq;

namespace Tier4
{
    class PrimeSieve
    {
        static void Main() {
            int limit = 30;
            bool[] prime = Enumerable.Repeat(true, limit + 1).ToArray();
            prime[0] = prime[1] = false;
            for (int i = 2; i * i <= limit; i++) if (prime[i]) for (int j = i * i; j <= limit; j += i) prime[j] = false;
            Console.Write("primes:");
            for (int i = 2; i <= limit; i++) if (prime[i]) Console.Write(" " + i);
            Console.WriteLine();
        }
    }
}
