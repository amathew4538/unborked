using System;
public class BoundsCheckElimination {
 public static void Main(string[] args) {
  int sum=0; foreach(var arg in args){ if(int.TryParse(arg,out int n)) sum+=n; }
  Console.WriteLine("feature=BoundsCheckElimination args="+args.Length+" sum="+sum);
 }
}
