using System;
class StateMachine { static void Main() { string s = "IDLE"; while (s != "STOPPED") { var c = (Console.ReadLine() ?? "").Trim(); if (s == "IDLE" && c == "deposit") s = "RUNNING"; else if (s == "RUNNING" && c == "pause") s = "PAUSED"; else if (s == "PAUSED" && c == "resume") s = "RUNNING"; else if (c == "stop") s = "STOPPED"; Console.WriteLine("state: " + s); } } }
