public class palindrom {
    public static boolean check(int n){
        int num=n;
          int rev=0;
        while (n>0) {
            int dig=n%10;
            n/=10;
            rev=(rev*10)+dig;
        }
        if (rev==num) 
           return true;
        return false;
    }
        
    
    public static void main(String[] args) {
        
    
    boolean ans=check(121);
    System.out.println(ans);
    }
}
