@main def main(): Unit = {
  for state <- List("IDLE", "RUNNING", "PAUSED", "STOPPED") do println(
    "state: " + state
  )
}
