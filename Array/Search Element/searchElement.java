public class searchElement{
     static int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,8,4,9,7,2};
        int ans=search(arr, 2);
        System.out.println(ans);

    }
}