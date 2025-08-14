import java.util.Arrays;

public class firstAndLastPossition {
     public static int[] searchRange(int[] nums, int target) {
        //first position
        int start=0,end=nums.length-1,mid,first=-1,last=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        //last position
        start=0;
        end=nums.length-1;
        while(start<=end){
             mid=start+(end-start)/2;
            if(nums[mid]==target){
                last=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
           
          return new int[]{first, last};
    }
    public static void main(String[] args) {
        int []nums={1,4,4,4,5,6,8,8,8,8};
       int[] ans = searchRange(nums, 8);
        System.out.println(Arrays.toString(ans));        
    }
    
}
