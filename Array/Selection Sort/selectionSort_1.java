public class selectionSort_1 {
    static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int idx=i;
            int temp;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[idx]) {
                    idx=j;
                }
                
            }
            //swaping
                temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,5,2,3};
        sort(arr);
        
    }
    
}
