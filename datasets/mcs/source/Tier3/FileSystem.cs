using System;
using System.IO;
using System.Linq;

namespace Tier3
{
    class FileSystem
    {
        static void Main() {
            string path = "unborked_tier3.txt";
            File.WriteAllText(path, "Hello, Dataset!");
            string content = File.ReadAllText(path);
            File.Delete(path);
            Console.WriteLine("filesystem: " + content);
        }
    }
}
