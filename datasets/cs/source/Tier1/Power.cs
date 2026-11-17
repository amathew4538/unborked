namespace Tier1
{
    class Power
    {
        static int Power(int a, int b) {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Power(2, 8));
            Console.WriteLine(Power(3, 4));
        }
    }
}
