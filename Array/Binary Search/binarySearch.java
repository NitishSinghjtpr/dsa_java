public class binarySearch {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,9};
        int start=0,end=arr.length-1,target=4,mid;
        

        while (start<=end) {
            mid=(start+end)/2;
            if (arr[mid]==target) {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }  
        }
    } 
}
