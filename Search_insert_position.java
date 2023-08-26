import java.util.*;
public class Search_insert_position {
	public static int searchInsert(int[] nums, int target) {
	     for(int i=0;i<nums.length;i++){
	       if(target <= nums[i])
	       return i;
	     }
	     return nums.length;
	    }
	public static void main(String[] args) {
	int nums[]= {1,3,5,6};	
    
    System.out.println(searchInsert(nums,2));
	}

}
