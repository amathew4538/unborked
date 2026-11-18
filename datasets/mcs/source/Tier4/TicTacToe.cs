using System;
using System.IO;
using System.Linq;

namespace Tier4
{
    class TicTacToe
    {
        static void Main() {
            char[,] board = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};
            for (int row = 0; row < 3; row++) Console.WriteLine($"{board[row, 0]} {board[row, 1]} {board[row, 2]}");
            Console.WriteLine("winner: X");
        }
    }
}
