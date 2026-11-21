using System;
class GuessingGame { static void Main() { int target = 42; Console.WriteLine("Guess a number from 1 to 100"); for (int i = 1; i <= 8; i++) { int g = 0; int.TryParse(Console.ReadLine(), out g); if (g == target) { Console.WriteLine($"Correct in {i} attempts"); return; } Console.WriteLine(g < target ? "Too low" : "Too high"); } Console.WriteLine("Out of guesses"); } }
