import java.util.*;
public class PLUS_ONE {
	 public static int[] plusOne(int[] digits) {
	       for(int i=digits.length-1;i>=0;i--) {
	    	   if(digits[i]<9) {
	    		   digits[i]++;
	    		   break;
	    	   }
	    	   else {
	    		   digits[i]=0;
	    	   }
	       }
	       if(digits[0]==0) {
	    	   int ans[]=new int[digits.length+1];
	    	   ans[0]=1;
	    	   return ans;
	       }
	       return digits;
	    }
	public static void main(String[] args) {
		int d[]= {9};
	    int ans[]=plusOne(d);
	    System.out.println(Arrays.toString(ans));
	}

}
