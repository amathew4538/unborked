using System;
using System.Linq;
class Sorting { static void Main(string[] a) { var v = a.Length > 0 ? a.Select(int.Parse).ToArray() : new[] { 42, 7, 13, 2, 64, 1 }; Array.Sort(v); Console.WriteLine("[" + string.Join(" ", v) + "]"); } }
