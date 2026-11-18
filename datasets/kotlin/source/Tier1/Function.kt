package datasets.kotlin.source.Tier1

fun void_function() = println("Hello from the void function.")

fun return_function() = "Hello from the return function."

fun parameter_function(a: Int) = a + 1

fun main() {
    void_function()
    println(return_function())
    println(parameter_function(6));
}
