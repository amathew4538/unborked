using System;
public class GarbageCollection{public static void Main(){byte[] report=new byte[4096];report[0]=1;GC.Collect();Console.WriteLine("gc_complete=true report_bytes="+report.Length);}}
