#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 54%1024 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 54;
        NSLog(@"feature=MemoryMappedFiles tier=12 seed=54 result=%ld", feature(54, value));
    }
    return 0;
}
