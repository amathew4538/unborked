namespace Tier1
{
    class Variables
    {
        int integer_var = 13;
        float float_var = 3.14f;
        double double_var = 0.456;
        const string string_var = "Hello, World!";
        static bool boolean_var = true;

        static void Main(string[] args)
        {
            Console.WriteLine($"Integer: {integer_var}, Float: {float_var}, Double: {double_var}, String: {string_var}, Boolean: {boolean_var}");
        }
    }
}
