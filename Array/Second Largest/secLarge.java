public class secLarge {
    public static void main(String[] args) {
        int arr[]={4,2,5,10,3,9,7,1,6};
        int second = Integer.MIN_VALUE,max=0;;
        for(int i=0;i<arr.length;i++){
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<arr.length;i++){
            if (max!=arr[i]&&second<arr[i]) {
                second=arr[i];
            }
        }
        System.out.println(second);
    }
    
}
