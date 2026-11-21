using System;
public class Delegates { public delegate int Transform(int value); public static void Main() { Transform transform = x => x * x + 3; Console.WriteLine("result=" + transform(7)); } }
