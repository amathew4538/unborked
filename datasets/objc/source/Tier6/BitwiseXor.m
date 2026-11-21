#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 45*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 45;
        NSLog(@"feature=BitwiseXor tier=6 seed=45 result=%ld", feature(45, value));
    }
    return 0;
}
