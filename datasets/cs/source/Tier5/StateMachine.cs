using System;
using System.IO;
using System.Linq;

namespace Tier5
{
    class StateMachine
    {
        static void Main() {
            foreach (string state in new[] {"IDLE", "RUNNING", "PAUSED", "STOPPED"}) Console.WriteLine("state: " + state);
        }
    }
}
