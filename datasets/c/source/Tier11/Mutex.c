#include <pthread.h>
#include <stdio.h>
static pthread_mutex_t lock = PTHREAD_MUTEX_INITIALIZER;
static int balance = 100;
void deposit(int n) {
  pthread_mutex_lock(&lock);
  balance += n;
  pthread_mutex_unlock(&lock);
}
int main(void) {
  deposit(25);
  pthread_mutex_lock(&lock);
  printf("balance=%d\n", balance);
  pthread_mutex_unlock(&lock);
}
