public class complimentOFNum {
    static int findCompliment(int n){
        int rem,mul=1,ans=0;
        if (n==0) {
            return 1;
        }
        while (n>0) {
            rem=n%2;
            rem=rem^1;
            n/=2;
            ans=ans+rem*mul;
            mul*=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int myAns=findCompliment(0);
        System.out.println(myAns);
    }
    
}
