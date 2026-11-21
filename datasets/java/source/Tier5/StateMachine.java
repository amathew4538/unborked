import java.util.*;

public class StateMachine {
    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);
        String s = "IDLE";
        while (!s.equals("STOPPED") && in.hasNextLine()) {
            String c = in.nextLine().trim();
            if (s.equals("IDLE") && c.equals("deposit"))
                s = "RUNNING";
            else if (s.equals("RUNNING") && c.equals("pause"))
                s = "PAUSED";
            else if (s.equals("PAUSED") && c.equals("resume"))
                s = "RUNNING";
            else if (c.equals("stop"))
                s = "STOPPED";
            System.out.println("state: " + s);
        }
    }
}
