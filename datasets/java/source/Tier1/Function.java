package datasets.java.source.Tier1;

public class Function {
    static void void_function() { System.out.println("Hello from the void function."); } static String return_function() { return "Hello from the return function."; } static int parameter_function(int a) { return a + 1; }
    public static void main(String[] args) {
        void_function();
        System.out.println(return_function());
        System.out.println(parameter_function(6));
    }
}
