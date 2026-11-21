import std/[os, strutils]

proc strtol(text: cstring, endPtr: ptr cstring, radix: cint): clong {.importc, header: "<stdlib.h>".}

let text = if paramCount() > 0: paramStr(1) else: "8080"
var endPtr: cstring = nil
let port = strtol(text.cstring, addr endPtr, 10)
echo "CInterop importc=strtol port=", port, " valid=", port >= 1 and port <= 65535
