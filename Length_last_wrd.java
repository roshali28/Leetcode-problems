import java.util.*;
public class Length_last_wrd {
	 public static int lengthOfLastWord(String s) {
	        String str[]=s.split(" ",0);
	       Stack<String> stk = new Stack<String>();
	       for(int i =0;i<str.length;i++){
	           stk.push(str[i]);
	       }
	        String S = stk.pop();
	        int ans = S.length();
	        return ans;
	    }
	public static void main(String[] args) {
		String s ="luffy is still joyboy";
		int ans = lengthOfLastWord(s);
		System.out.println(ans);

	}

}
