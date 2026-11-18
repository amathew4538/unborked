#include <stdio.h>

typedef enum { IDLE, RUNNING, PAUSED, STOPPED } State;

int main(void) {
    State state = IDLE;
    printf("state: IDLE\n");

    state = RUNNING;
    printf("state: RUNNING\n");

    state = PAUSED;
    printf("state: PAUSED\n");

    state = STOPPED;
    printf("state: STOPPED\n");
    return 0;
}
