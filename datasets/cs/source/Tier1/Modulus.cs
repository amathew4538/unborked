namespace Tier1
{
    class Modulus
    {
        int Modulo(int a, int b) {
            return a % b;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Modulo(0, 1));
            Console.WriteLine(Modulo(7, 13));
            Console.WriteLine(Modulo(65536, 1000));
            Console.WriteLine(Modulo(64, 8));
            Console.WriteLine(Modulo(-42, -1));
        }
    }
}
