namespace Tier1
{
    class Addition
    {
        int Add(int a, int b) {
            return a + b;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Add(0, 1));
            Console.WriteLine(Add(7, 13));
            Console.WriteLine(Add(65536, 1000));
            Console.WriteLine(Add(64, 8));
            Console.WriteLine(Add(-42, -1));
        }
    }
}
