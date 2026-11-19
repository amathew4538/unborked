#include <cstdio>
#include <unistd.h>
int main(){int fd[2];char b[]="pipe ready";if(pipe(fd)==0){write(fd[1],b,sizeof(b));char out[32]={0};read(fd[0],out,sizeof(out));std::printf("%s\n",out);close(fd[0]);close(fd[1]);}return 0;}
