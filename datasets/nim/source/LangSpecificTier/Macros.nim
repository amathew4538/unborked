import std/macros
macro constMessage(): untyped = newLit("macro_expanded=true")
static:
  echo constMessage()
