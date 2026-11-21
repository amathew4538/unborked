#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (61%64)*(61%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 61;
        NSLog(@"feature=Trie tier=13 seed=61 result=%ld", feature(61, value));
    }
    return 0;
}
