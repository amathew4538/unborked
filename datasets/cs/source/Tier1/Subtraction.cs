namespace Tier1
{
    class Subtraction
    {
        static int Subtract(int a, int b) {
            return a - b;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Subtract(0, 1));
            Console.WriteLine(Subtract(7, 13));
            Console.WriteLine(Subtract(65536, 1000));
            Console.WriteLine(Subtract(64, 8));
            Console.WriteLine(Subtract(-42, -1));
        }
    }
}
