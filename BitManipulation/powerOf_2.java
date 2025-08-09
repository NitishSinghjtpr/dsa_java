public class powerOf_2 {
    static int powerOf(int x){
        while (x!=1) {
            if (x%2==1) {
                return 0;
               
            }else{
                x/=2;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
       int ans= powerOf(64);
        System.out.println(ans);

    }
    
}
