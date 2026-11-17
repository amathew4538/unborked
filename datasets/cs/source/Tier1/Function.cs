namespace Tier1
{
    class Function
    {
        void VoidFunction()
        {
            Console.WriteLine("Hello from the void function");
        }

        string ReturnFunction() {
            return "Hello from the return function.";
        }

        int ParameterFunction(int a) {
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
