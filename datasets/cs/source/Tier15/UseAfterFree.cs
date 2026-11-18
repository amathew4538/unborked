using System;
public class UseAfterFree {
 public static void Main(string[] args) {
  int sum=0; foreach(var arg in args){ if(int.TryParse(arg,out int n)) sum+=n; }
  Console.WriteLine("feature=UseAfterFree args="+args.Length+" sum="+sum);
 }
}
