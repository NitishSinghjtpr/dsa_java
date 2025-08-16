public class indertElement {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,8};
        int n=arr.length;
        int start=0,end=arr.length-1,mid,index=n;
        int target=7;
        while (start<=end) {
            mid=start+(end-start)/2;
            if (arr[mid]==target) {
                index=mid;
                break;
            }else if (arr[mid]>target) {
                index=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
           
        }
         System.out.println(index);
        
    }
    
}
