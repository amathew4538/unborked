#include <pthread.h>
#include <stdio.h>
void *worker(void *arg) {
  int n = *(int *)arg;
  printf("worker processed %d\n", n * n);
  return NULL;
}
int main(void) {
  pthread_t t;
  int n = 12;
  pthread_create(&t, NULL, worker, &n);
  pthread_join(t, NULL);
}
