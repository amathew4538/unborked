using System;
using System.IO;
using System.Linq;

namespace Tier3
{
    class BinarySearch
    {
        static void Main() {
            int[] values = {2, 7, 13, 42, 64, 100};
            Console.WriteLine("index: " + Array.BinarySearch(values, 42));
        }
    }
}
