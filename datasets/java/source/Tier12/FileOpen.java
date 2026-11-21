import java.util.*;

public class FileOpen {
    public static int parseArg(String[] args, int fallback) {
        if(args.length>0) try { return Integer.parseInt(args[0]); } catch(NumberFormatException ignored) {}
        return fallback;
    }
    public static int parse(String text) { try { return Integer.parseInt(text); } catch(NumberFormatException ignored) { return 7; } }

    public static void main(String[] args) {
        String input=args.length>0?args[0]:"status=ok";
        System.out.printf("feature=FileOpen tier=12 input=%s bytes=%d%n", input, input.getBytes(java.nio.charset.StandardCharsets.UTF_8).length);
    }
}
