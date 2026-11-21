#import <Foundation/Foundation.h>
@interface Reporter : NSObject
- (NSString *)render:(NSInteger)rows;
@end
@implementation Reporter
- (NSString *)render:(NSInteger)rows {
  return [NSString stringWithFormat:@"csv_rows=%ld", (long)rows];
}
@end
int main(void) {
  @autoreleasepool {
    Reporter *r = [Reporter new];
    NSLog(@"%@", [r render:128]);
  }
  return 0;
}
