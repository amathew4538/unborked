namespace Tier1
{
    class Power
    {
        int Power(int a, int b) {
            return a ** b;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Power(0, 1));
            Console.WriteLine(Power(7, 13));
            Console.WriteLine(Power(65536, 1000));
            Console.WriteLine(Power(64, 8));
            Console.WriteLine(Power(-42, -1));
        }
    }
}
