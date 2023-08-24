import java.util.*;
public class merger_sorted_arr {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            if(nums1[i] != 0)
            l2.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(nums2[j] != 0)
            l2.add(nums2[j]);
        }
        l1.addAll(l2);
        Collections.sort(l1);
        System.out.println(l1);
        
    }
	public static void main(String[] args) {
		int nums1[]= {1,2,3,0,0,0};
		int nums2[]= {2,5,6};
		int m = nums1.length;
		int n = nums2.length;
        merge(nums1,m,nums2,n);
	}

}
