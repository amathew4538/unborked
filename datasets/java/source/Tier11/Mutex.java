import java.util.*;

public class Mutex {
    public static int parseArg(String[] args, int fallback) {
        if(args.length>0) try { return Integer.parseInt(args[0]); } catch(NumberFormatException ignored) {}
        return fallback;
    }
    public static int parse(String text) { try { return Integer.parseInt(text); } catch(NumberFormatException ignored) { return 7; } }

    public static void main(String[] args) {
        int workers=args.length>0?parse(args[0]):4;
        java.util.concurrent.ExecutorService pool=java.util.concurrent.Executors.newFixedThreadPool(Math.max(1,workers));
        java.util.concurrent.Future<Integer> job=pool.submit(() -> workers*25);
        try { System.out.printf("feature=Mutex tier=11 result=%d%n", job.get()); } catch (InterruptedException | java.util.concurrent.ExecutionException error) { System.out.println("feature="+error.getClass().getSimpleName()); } finally { pool.shutdown(); }
    }
}
