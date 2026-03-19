public class removeDuplicateElement {
    public static void main(String[] args) {
        int arr[] = {2,2,4,5,7,7,9,9,10};
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
            System.out.println(temp[i]);
        }
    }
    
}
