#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 26+32 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 26;
        NSLog(@"feature=StaticLinking tier=10 seed=26 result=%ld", feature(26, value));
    }
    return 0;
}
