#import <Foundation/Foundation.h>
int main(void) {
  @autoreleasepool {
    NSMutableArray *items = [NSMutableArray array];
    [items addObject:@"report"];
    NSLog(@"items=%lu", (unsigned long)items.count);
  }
  return 0;
}
