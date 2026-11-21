#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 15+32 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 15;
        NSLog(@"feature=SymbolVisibility tier=10 seed=15 result=%ld", feature(15, value));
    }
    return 0;
}
