#include <cstdio>
#include <cstdlib>
#include <cstdint>
#include <cmath>
#include <cstring>
#include <cstddef>
using std::printf; using std::puts;


struct Player{char name[32];int level;double score;};int main(void){struct Player p={"Ada",12,980.5};printf("%s level=%d score=%.1f\n",p.name,p.level,p.score);printf("size=%zu offset(level=%zu)\n",sizeof(p),offsetof(struct Player,level));}
