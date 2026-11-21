#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(96%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 96;
        NSLog(@"feature=DataRace tier=11 seed=96 result=%ld", feature(96, value));
    }
    return 0;
}
