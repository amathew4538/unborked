#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(14%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 14;
        NSLog(@"feature=Mutex tier=11 seed=14 result=%ld", feature(14, value));
    }
    return 0;
}
