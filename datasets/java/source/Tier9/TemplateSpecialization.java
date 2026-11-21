import java.util.*;

public class TemplateSpecialization {
    public static long feature(long seed, long value) {
        long result = (95%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 95;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=TemplateSpecialization tier=9 seed=95 result=%d%%n", feature(95, value));
    }
}
