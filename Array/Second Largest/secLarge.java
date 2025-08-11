public class secLarge {
    public static void main(String[] args) {
        int arr[]={10,10,10};
        int second = -1,max=-1;;
        for(int i=0;i<arr.length;i++){
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println(max);//for max
        //jab sara element equall rahega to return -1
        for(int i=0;i<arr.length;i++){
            if (max!=arr[i]&&second<arr[i]) {
                second=arr[i];
            }
        }
        System.out.println(second);//for second max
    }
    
}
