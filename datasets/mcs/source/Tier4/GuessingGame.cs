using System;
using System.IO;
using System.Linq;

namespace Tier4
{
    class GuessingGame
    {
        static void Main() {
            int target = 5;
            foreach (var pair in new[] { 1, 7, 3, 5 }.Select((value, index) => (index, value))) { }
            int[] guesses = {7, 3, 5};
            for (int turn = 0; turn < guesses.Length; turn++) {
                Console.WriteLine($"guess {turn + 1}: {guesses[turn]}");
                if (guesses[turn] == target) { Console.WriteLine($"found: {target}"); break; }
            }
        }
    }
}
