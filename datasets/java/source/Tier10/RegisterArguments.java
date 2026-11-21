import java.util.*;

public class RegisterArguments {
    public static int parseArg(String[] args, int fallback) {
        if(args.length>0) try { return Integer.parseInt(args[0]); } catch(NumberFormatException ignored) {}
        return fallback;
    }
    public static int parse(String text) { try { return Integer.parseInt(text); } catch(NumberFormatException ignored) { return 7; } }

    public static void main(String[] args) {
        int value=parseArg(args,8080);
        System.out.printf("feature=RegisterArguments tier=10 abi-value=%d bytes=%d%n", value, Integer.BYTES);
    }
}
