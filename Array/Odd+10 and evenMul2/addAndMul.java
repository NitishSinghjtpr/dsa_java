public class addAndMul
 {
    public static void main(String[] args) {
        int arr[]={2,3,5,1,4,11};
        
        for(int i=0;i<arr.length;i++){
           
          if(i%2==1){
              arr[i]*=2;
          }else{
              arr[i]+=10;
          }
           System.out.print(arr[i]+" ");
        }
        
    }
    
}
