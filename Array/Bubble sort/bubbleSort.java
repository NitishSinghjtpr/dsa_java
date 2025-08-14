public class bubbleSort {
    static void bubble(int []arr, int n){
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
               
            }
        }
         for(int j=0;j<n;j++){
                System.out.println(arr[j]);
            }
    }
    public static void main(String[] args) {
        int arr[]={20,30,5,7,9};
        bubble(arr, 5);
    }
    
}
