using System;using System.Reflection;
public class ClrReflection{public string Render(){return "csv_rows=128";}public static void Main(){MethodInfo m=typeof(ClrReflection).GetMethod("Render");Console.WriteLine(m.Invoke(new ClrReflection(),null));}}
