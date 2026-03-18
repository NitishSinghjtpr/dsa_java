public class checkTarget {
     public static void main(String[] args) {
        int arr[]={2,4,9,6,3,7};
        int target=16;
        for(int i=1;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int k=arr[i]+arr[j];
                if(target==k){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }
    
}
