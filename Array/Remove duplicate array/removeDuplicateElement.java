public class removeDuplicateElement {
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,5,7,7,8,8,8,9,9,10,10,10};
        int temp[] = new int[arr.length];  // initialize

        int j = 0;
        temp[j] = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != temp[j]){
                j++;
                temp[j] = arr[i];
            }
        }

        for(int i = 0; i <= j; i++){
            System.out.print(temp[i]+" ");
        }
    }
    
}
