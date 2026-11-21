#include <stdio.h>
int validate(int age, int balance) {
  if (age < 18)
    return -1;
  if (balance < 0)
    return -2;
  return 0;
}
int main(void) { printf("account_status=%d\n", validate(25, 100)); }
