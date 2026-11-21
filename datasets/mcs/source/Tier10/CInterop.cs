using System;
using System.Runtime.InteropServices;
public class CInterop {
    [DllImport("libc", EntryPoint="strtol", CallingConvention=CallingConvention.Cdecl)]
    private static extern long Strtol(string text, out IntPtr end, int radix);
    public static void Main(string[] args) {
        string text=args.Length>0?args[0]:"8080";
        IntPtr end;
        long port=Strtol(text,out end,10);
        bool valid=port>=1&&port<=65535;
        Console.WriteLine($"CInterop PInvoke=strtol port={port} valid={valid}");
    }
}
