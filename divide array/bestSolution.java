public class bestSolution {
    static int subArray(int[] arr){
        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        int prefix=0,ans=0;
        for(int j=0;j<n-1;j++){
            prefix+=arr[j];
            ans=totalSum-prefix;
            if (ans==prefix) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr={1,-1,5,5};
        int ans=subArray(arr);
        System.out.println(ans);
    }
    
}
