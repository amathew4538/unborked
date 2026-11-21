using System;
class BinarySearch { static void Main(string[] a) { int[] v = { 2, 7, 13, 42, 64, 100 }; int t = a.Length > 0 ? int.Parse(a[0]) : 42; int i = Array.BinarySearch(v, t); Console.WriteLine(i >= 0 ? $"found {t} at {i}" : $"not found: {t}"); } }
