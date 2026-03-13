public class prefix {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
       public static void main(String[] args) {
        int nums[]={4,2,4};
       prefix obj=new prefix();
      int[] ans= obj.runningSum(nums);
      System.out.println(ans);
    }

    
}
