#import <Foundation/Foundation.h>

static long applyFeature(long value) { return value * value + 3; }

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 42;
        NSLog(@"feature=FileWrite value=%ld result=%ld", value, applyFeature(value));
    }
    return 0;
}
