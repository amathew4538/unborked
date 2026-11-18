package datasets.java.source.Tier5;

public class StateMachine {
    public static void main(String[] args) {
        String[] states = {"IDLE", "RUNNING", "PAUSED", "STOPPED"};
        for (String state : states) System.out.println("state: " + state);
    }
}
