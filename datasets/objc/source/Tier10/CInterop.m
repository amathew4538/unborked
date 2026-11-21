#import <Foundation/Foundation.h>
#import <stdlib.h>
int main(int argc, const char * argv[]) {
    @autoreleasepool {
        const char *text = argc > 1 ? argv[1] : "8080";
        char *end = NULL;
        long port = strtol(text, &end, 10);
        BOOL valid = port >= 1 && port <= 65535 && end && *end == '\0';
        NSLog(@"CInterop C-call=strtol port=%ld valid=%@", port, valid ? @"true" : @"false");
    }
    return 0;
}
