#import <Foundation/Foundation.h>

int subtract(int a, int b) { return a - b; }

int main() {
  @autoreleasepool {
    NSLog(@"%d", subtract(0, 1));
    NSLog(@"%d", subtract(7, 13));
    NSLog(@"%d", subtract(65536, 1000));
    NSLog(@"%d", subtract(64, 8));
    NSLog(@"%d", subtract(-42, -1));
  }

  return 0;
}
