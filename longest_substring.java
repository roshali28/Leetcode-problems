import java.util.*;
public class longest_substring {	
 public static int lengthOfLongestSubstring(String s) {
	 HashSet<Character> h = new HashSet<>();
     int start=0;
     int end=0;
     int count=0; 
     while(end < s.length()){
      if(h.add(s.charAt(end))){
          end++;
          count=Math.max(count,h.size());
      }
      else{
          h.remove(s.charAt(start));
          start++;
      }
     }
     return count; 
	    }
 public static void main(String[] args) { 
	     int y =lengthOfLongestSubstring("pwwkew");
	     System.out.println(y);
	 
	}

}
