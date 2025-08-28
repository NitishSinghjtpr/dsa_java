public class searchingElement {
    //searching element in rotate array
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int s=0,e=arr.length-1,mid,target=1,ans=-1;
        while (s<=e) {
            mid=s+(e-s)/2;
            if(arr[mid]==target){
             ans=mid;
            }else if (arr[mid]>=arr[0]) {
                if (arr[s]<=target && arr[mid]>=target) {
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                if (arr[mid]<=target&&arr[e]>=target) {
                 s=mid+1;
                }else{
                    e=mid-1; 
                }
            }
        }
        System.out.println(ans);
    }
    
}
