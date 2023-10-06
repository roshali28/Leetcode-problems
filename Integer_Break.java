import java.util.*;
public class Integer_Break {
public static int intBreak(int n) {
	if( n==2 || n==3) {
		return n-1;
	}
	int ans=1;
	while(n>4) {
		ans = ans*3;
		n = n-3;
	}
	return ans*n;
}
	public static void main(String[] args) {
	int n = 10;
	int ans = intBreak(n);
    System.out.println(ans);
	}

}
