//Time complexity O(n^2)
public class twoSubArray {
    static int subArray(int[] arr){
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            int sum1=0,sum2=0;
            for(int j=0;j<=i;j++){
                sum1+=arr[j];
            }
            for(int j=i+1;j<n;j++){
                sum2+=arr[j];
            }
            if(sum1==sum2){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr={1,-1,5,2,3,10};
        int ans=subArray(arr);
        System.out.println(ans);
    }
    
}
