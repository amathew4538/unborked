#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (77%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 77;
        NSLog(@"feature=ExtensionMethods tier=9 seed=77 result=%ld", feature(77, value));
    }
    return 0;
}
