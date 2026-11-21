#include <stdio.h>
#include <string.h>

typedef enum { IDLE, RUNNING, PAUSED, STOPPED } State;

int main(void) {
  State state = IDLE;
  char command[16];
  puts("ATM state machine: commands=deposit withdraw pause resume stop");
  while (state != STOPPED) {
    printf("state: %d> ", state);
    fflush(stdout);
    if (!fgets(command, sizeof(command), stdin))
      break;
    if (state == IDLE && strncmp(command, "deposit", 7) == 0)
      state = RUNNING;
    else if (state == RUNNING && strncmp(command, "pause", 5) == 0)
      state = PAUSED;
    else if (state == PAUSED && strncmp(command, "resume", 6) == 0)
      state = RUNNING;
    else if (state == RUNNING && strncmp(command, "withdraw", 8) == 0)
      state = IDLE;
    else if (strncmp(command, "stop", 4) == 0)
      state = STOPPED;
    else
      puts("invalid transition");
  }
  puts("state: STOPPED");
  return 0;
}
