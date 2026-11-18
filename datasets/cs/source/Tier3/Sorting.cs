using System;
using System.IO;
using System.Linq;

namespace Tier3
{
    class Sorting
    {
        static void Main() {
            int[] values = {42, 7, 13, 2, 64, 1};
            Array.Sort(values);
            Console.WriteLine(string.Join(" ", values));
        }
    }
}
