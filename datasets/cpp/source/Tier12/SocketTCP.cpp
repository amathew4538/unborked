#include <cstdio>
#include <sys/socket.h>
#include <unistd.h>
int main() {
  int fd = socket(AF_INET, SOCK_STREAM, 0);
  std::printf("tcp_socket=%d\n", fd);
  if (fd >= 0)
    close(fd);
  return 0;
}
