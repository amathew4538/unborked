package datasets.java.source.Tier1;

public class Power {
    static int power(int a,int b) {
        int result=1;
        for(int i=0;i<b;i++) result*=a;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 8));
        System.out.println(power(3, 4));
    }
}
