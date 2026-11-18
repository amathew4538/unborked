using System;
using System.IO;
using System.Linq;

namespace Tier5
{
    class DataPipeline
    {
        static void Main() {
            int[] input = {1, 2, 3, 4, 5, 6};
            var processed = input.Where(value => value % 2 == 0).Select(value => value * value).ToArray();
            Console.WriteLine("processed: " + processed.Length);
            Console.WriteLine("squares sum: " + processed.Sum());
        }
    }
}
