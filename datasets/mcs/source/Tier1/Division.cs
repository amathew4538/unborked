namespace Tier1
{
    class Division

    {
        static int Divide(int a, int b) {
            return a / b;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Divide(0, 1));
            Console.WriteLine(Divide(7, 13));
            Console.WriteLine(Divide(65536, 1000));
            Console.WriteLine(Divide(64, 8));
            Console.WriteLine(Divide(-42, -1));
        }
    }
}
