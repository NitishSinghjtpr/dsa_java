public class pallindron {
    static int isPallindrom(int n){
        int rem,ans=0,num=n;
        while (n>0) {
            rem=n%10;
            if (ans>Integer.MAX_VALUE/10) {
                return 0;
            }
            ans=ans*10+rem;
            n/=10;
        }
        if (num==ans) {
            return 1;
        }else{
            return 0;
        }
       
    }
    public static void main(String[] args) {
        int myAns=isPallindrom(1000000001);
        System.out.println(myAns);
    }
}
