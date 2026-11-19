import java.util.*;
public class Endianness {
 public static void main(String[] args) {
  int sum=0; for(String arg:args){ try{sum+=Integer.parseInt(arg);}catch(NumberFormatException ignored){} }
  System.out.printf("feature=Endianness args=%d sum=%d%%n",args.length,sum);
 }
}
