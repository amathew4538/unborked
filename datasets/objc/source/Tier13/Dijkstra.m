#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (86%64)*(86%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 86;
        NSLog(@"feature=Dijkstra tier=13 seed=86 result=%ld", feature(86, value));
    }
    return 0;
}
