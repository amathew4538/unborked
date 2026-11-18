using System;

namespace Tier1 {
    class Array {
        static void Main(string[] args) {
            int[] values = { 2, 4, 6, 8, 10 };
            int sum = 0;
            foreach (int value in values) {
                Console.WriteLine(value); sum += value;
            }
            Console.WriteLine(sum);
        }
    }
}
