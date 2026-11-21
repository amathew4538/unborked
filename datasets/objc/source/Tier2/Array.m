#import <Foundation/Foundation.h>

int main() {
  @autoreleasepool {
    int values[] = {2, 4, 6, 8, 10};
    int sum = 0;

    for (int i = 0; i < 5; i++) {
      NSLog(@"%d", values[i]);
      sum += values[i];
    }

    NSLog(@"%d", sum);
  }

  return 0;
}
