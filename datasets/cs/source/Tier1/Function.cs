namespace Tier1
{
    class Function
    {
        static void VoidFunction()
        {
            Console.WriteLine("Hello from the void function");
        }

        static string ReturnFunction() {
            return "Hello from the return function.";
        }

        static int ParameterFunction(int a) {
            return a + 1;
        }

        static void Main(string[] args)
        {
            VoidFunction();
            Console.WriteLine(ReturnFunction());
            Console.WriteLine(ParameterFunction(6));
        }
    }
}
