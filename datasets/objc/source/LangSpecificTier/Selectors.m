#import <Foundation/Foundation.h>
@interface Counter:NSObject- (NSInteger)increment:(NSInteger)value;@end
@implementation Counter- (NSInteger)increment:(NSInteger)value{return value+1;}@end
int main(void){@autoreleasepool{Counter*c=[Counter new];SEL s=@selector(increment:);if([c respondsToSelector:s])NSLog(@"next=%ld",(long)[c increment:41]);}return 0;}
