package datasets.java.source.Tier1;

public class Subtraction {
    static int subtract(int a,int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(subtract(0,1));
        System.out.println(subtract(7,13));
        System.out.println(subtract(65536,1000));
        System.out.println(subtract(64,8));
        System.out.println(subtract(-42,-1));
    }
}
