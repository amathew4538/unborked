#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (10%64)*(10%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 10;
        NSLog(@"feature=Checksum tier=13 seed=10 result=%ld", feature(10, value));
    }
    return 0;
}
