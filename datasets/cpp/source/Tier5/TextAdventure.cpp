#include <stdio.h>
#include <string.h>

int main(void) {
  const char *room = "courtyard";
  int has_key = 0, door_unlocked = 0;
  char command[32];
  puts("You stand in a moonlit courtyard.");
  while (1) {
    printf("[%s]> ", room);
    fflush(stdout);
    if (!fgets(command, sizeof(command), stdin))
      break;
    if (strncmp(command, "north", 5) == 0 && strcmp(room, "courtyard") == 0)
      room = "library";
    else if (strncmp(command, "south", 5) == 0 && strcmp(room, "library") == 0)
      room = "courtyard";
    else if (strncmp(command, "take", 4) == 0 && strcmp(room, "library") == 0) {
      has_key = 1;
      puts("Taken: brass key");
    } else if (strncmp(command, "unlock", 6) == 0 && has_key)
      door_unlocked = 1;
    else if (strncmp(command, "quit", 4) == 0)
      break;
    else
      puts("Nothing happens.");
    printf("room: %s\n", room);
    if (door_unlocked) {
      puts("The door opens. You escaped!");
      break;
    }
  }
  return 0;
}
