public class maxElement {
    public static void main(String[] args) {
        int arr[]={2,31,5,1,4,11};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
           
          if(max<arr[i]){
              max=arr[i];
              
          }
           
        }
        System.out.println(max);
    }
}
