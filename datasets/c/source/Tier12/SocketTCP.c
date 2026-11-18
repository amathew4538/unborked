#include <stdio.h>
#include <sys/socket.h>
#include <netinet/in.h>
int main(void){int fd=socket(AF_INET,SOCK_STREAM,0);printf("tcp_socket=%d\n",fd);if(fd>=0)close(fd);}
