#include <stdio.h>
#include <unistd.h>
int main(void) {
  int fd[2];
  char b[] = {"pipe ready"};
  if (pipe(fd) == 0) {
    write(fd[1], b, sizeof(b));
    char out[32] = {0};
    read(fd[0], out, sizeof(out));
    printf("%s\n", out);
    close(fd[0]);
    close(fd[1]);
  }
}
