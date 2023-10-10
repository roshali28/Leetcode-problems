import java.util.*;
public class findMedianSortedArrays {
	public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    int n = nums1.length + nums2.length;
	    int nums3[] = new int[n];
	    System.arraycopy(nums1, 0, nums3, 0, nums1.length);
	    System.arraycopy(nums2, 0, nums3,nums1.length, nums2.length);
	    Arrays.sort(nums3);
	    double median=0;
	    if (nums3.length % 2 != 0) {
	    	int i = nums3.length/2;
	    	median = nums3[i];
	    }
	    else {
	    	int j = nums3.length/2;
	    	median = (double)(nums3[j]+nums3[j-1])/2;
	    }
	    return median;
	}
	public static void main(String[] args) {
		int nums1[]= {1,2};
		int nums2[]= {3,4};	
	    double ans =  findMedianSortedArrays(nums1,nums2);
	    System.out.println(ans);
	}
}
