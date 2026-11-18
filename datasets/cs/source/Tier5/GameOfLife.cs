using System;
using System.IO;
using System.Linq;

namespace Tier5
{
    class GameOfLife
    {
        static void Main() {
            bool[,] grid = new bool[5, 5];
            grid[1, 2] = grid[2, 2] = grid[3, 2] = true;
            bool[,] next = new bool[5, 5];
            for (int row = 0; row < 5; row++) for (int column = 0; column < 5; column++) {
                int neighbours = 0;
                for (int dy = -1; dy <= 1; dy++) for (int dx = -1; dx <= 1; dx++) {
                    if (dx == 0 && dy == 0) continue;
                    int y = row + dy, x = column + dx;
                    if (y >= 0 && y < 5 && x >= 0 && x < 5 && grid[y, x]) neighbours++;
                }
                next[row, column] = neighbours == 3 || (grid[row, column] && neighbours == 2);
            }
            Console.WriteLine("generation: 1");
            for (int row = 0; row < 5; row++) { for (int column = 0; column < 5; column++) Console.Write(next[row, column] ? '#' : '.'); Console.WriteLine(); }
        }
    }
}
