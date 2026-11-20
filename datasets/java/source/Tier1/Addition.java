package datasets.java.source.Tier1;

public class Addition {
    static int add(int a,int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(0,1));
        System.out.println(add(7,13));
        System.out.println(add(65536,1000));
        System.out.println(add(64,8));
        System.out.println(add(-42,-1));
    }
}
