import java.util.*;
public class FirstOccurInString {
public static int strStr(String haystack, String needle) {
	int l1 = haystack.length();
	int l2 = needle.length();
	for(int i=0;i<l1-l2+1;i++) {
		if(haystack.substring(i,i+l2).equals(needle)) {
			return i;
		}
	}
	 return -1;         
    }
	public static void main(String[] args) {
	String	haystack = "butsad";
	String	needle = "sad";
	int m =strStr(haystack,needle);
    System.out.println(m);
	}

}
