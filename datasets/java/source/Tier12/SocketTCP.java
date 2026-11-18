import java.util.*;
public class SocketTCP {
 public static void main(String[] args) {
  int sum=0; for(String arg:args){ try{sum+=Integer.parseInt(arg);}catch(NumberFormatException ignored){} }
  System.out.printf("feature=SocketTCP args=%d sum=%d%%n",args.length,sum);
 }
}
