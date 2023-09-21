import java.util.*;
public class AddBinary {
	public static String addBinary(String a, String b) {
	      int num1= Integer.parseInt(a,2);
	      int num2= Integer.parseInt(b,2);
	      int sum = num1+num2;
	      String ans = Integer.toBinaryString(sum);
	      return ans;   
	    }
	public static void main(String[] args) {
	  String s = addBinary("11","1");
	  System.out.println(s);
	  

	}

}
