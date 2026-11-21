def void_function(): Unit = println("Hello from the void function.")

def return_function(): String = "Hello from the return function."

def parameter_function(a: Int): Int = a + 1

@main def main(): Unit = {
  void_function()
  println(return_function())
  println(parameter_function(6))
}
