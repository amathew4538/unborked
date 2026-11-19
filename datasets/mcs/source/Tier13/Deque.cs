using System;
public class Deque {
 public static void Main(string[] args) {
  int sum=0; foreach(var arg in args){ if(int.TryParse(arg,out int n)) sum+=n; }
  Console.WriteLine("feature=Deque args="+args.Length+" sum="+sum);
 }
}
