#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(89%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 89;
        NSLog(@"feature=Promise tier=11 seed=89 result=%ld", feature(89, value));
    }
    return 0;
}
