import java.util.*;
public class longest_substring {
	 public static int lengthOfLongestSubstring(String s) {
		 
	        char ch[]=s.toCharArray();
	        char ch1[]=new char[s.length()];
	        int j=0;
	        for(int i=1;i<ch.length;i++){
            	if(ch[i] != ch[i-1]) {
            		ch1[j++]=ch[i];
            	}
	        }
	        int count=ch1.length;
	        return count;
	    }
	public static void main(String[] args) {
	  String s="pwwkew";
	 int ans = lengthOfLongestSubstring(s);
	 System.out.println(ans); 
	}

}
