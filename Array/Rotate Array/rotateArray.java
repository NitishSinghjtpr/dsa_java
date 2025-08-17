public class rotateArray {
    public static void main(String[] args) {
        int arr[]={4,6,8,10,1,2};
        int start=0,end=arr.length-1,mid,ans=arr[0];
        while (start<=end) {
            mid=start+(end-start)/2;
            if(arr[mid]>=arr[0]){//left sorted mins search in right side
                start=mid+1;
            }else if(arr[mid]<arr[0]){//right sorted mins search in left side & store current ans
                ans=arr[mid];
                end=mid-1;
            }
        }
        System.out.println(ans);
        
    }
    
}
