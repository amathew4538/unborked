using System;
using System.IO;
using System.Linq;

namespace Tier3
{
    class Matrix
    {
        static void Main() {
            int[,] left = {{1, 2, 3}, {4, 5, 6}};
            int[,] right = {{7, 8}, {9, 10}, {11, 12}};
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 2; column++) {
                    int value = 0;
                    for (int inner = 0; inner < 3; inner++) value += left[row, inner] * right[inner, column];
                    Console.Write(value + (column == 1 ? "\n" : " "));
                }
            }
        }
    }
}
