using System;
class Matrix { static void Main() { int[,] x = { { 1, 2, 3 }, { 4, 5, 6 } }, y = { { 7, 8 }, { 9, 10 }, { 11, 12 } }; for (int r = 0; r < 2; r++) { for (int c = 0; c < 2; c++) { int n = 0; for (int k = 0; k < 3; k++) n += x[r, k] * y[k, c]; Console.Write(n + (c == 1 ? "\n" : " ")); } } } }
