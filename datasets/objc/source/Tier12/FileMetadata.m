#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 40%1024 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 40;
        NSLog(@"feature=FileMetadata tier=12 seed=40 result=%ld", feature(40, value));
    }
    return 0;
}
