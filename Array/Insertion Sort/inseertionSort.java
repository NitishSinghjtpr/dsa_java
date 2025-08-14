public class inseertionSort {
    static void insertion(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if (arr[j]<arr[j-1]) {
                    int temp =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
           
        }
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={4,8,5,8};
        insertion(arr);
    }
    
}
