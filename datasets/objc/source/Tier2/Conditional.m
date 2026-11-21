#import <Foundation/Foundation.h>

NSString *classify(int n) {
  if (n < 0)
    return @"negative";
  if (n > 0)
    return @"positive";
  return @"zero";
}

int main() {
  @autoreleasepool {
    NSLog(@"%@", classify(-1));
    NSLog(@"%@", classify(0));
    NSLog(@"%@", classify(1));
  }

  return 0;
}
