using System;
public class Inheritance {
 public static void Main(string[] args) {
  int sum=0; foreach(var arg in args){ if(int.TryParse(arg,out int n)) sum+=n; }
  Console.WriteLine("feature=Inheritance args="+args.Length+" sum="+sum);
 }
}
