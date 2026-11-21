#include <stdio.h>
struct Shape {
  void (*draw)(void);
};
void circle(void) { puts("circle"); }
void square(void) { puts("square"); }
int main(void) {
  struct Shape s = {circle};
  s.draw();
  s.draw = square;
  s.draw();
}
