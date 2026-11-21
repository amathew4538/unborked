import java.util.*;

public class Checksum {
    public static int parseArg(String[] args, int fallback) {
        if(args.length>0) try { return Integer.parseInt(args[0]); } catch(NumberFormatException ignored) {}
        return fallback;
    }
    public static int parse(String text) { try { return Integer.parseInt(text); } catch(NumberFormatException ignored) { return 7; } }

    public static void main(String[] args) {
        java.util.ArrayList<Integer> values=new java.util.ArrayList<>(java.util.Arrays.asList(5,1,4,2,3));
        java.util.Collections.sort(values);
        System.out.printf("feature=Checksum tier=13 sorted=%s%n", values);
    }
}
