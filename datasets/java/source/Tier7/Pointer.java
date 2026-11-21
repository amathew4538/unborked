import java.util.*;

public class Pointer {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.printf("feature=Pointer args=%d sum=%d%%n", args.length, sum);
    }
}
