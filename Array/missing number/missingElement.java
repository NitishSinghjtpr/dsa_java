public class missingElement {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // sum from 0 to n
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }
        System.out.println(expectedSum+" - "+actualSum);
        // jab koi bhi element missingh nhi ho to return -1;
        int ans=expectedSum - actualSum;
        if(ans==0){
            return -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int ans=missingNumber(nums);
        System.out.println(ans);

    }
    
}
