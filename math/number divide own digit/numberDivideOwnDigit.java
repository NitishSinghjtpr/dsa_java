public class numberDivideOwnDigit {
    static int divideByDigit(int n) {
        // code here
        int num=n;
        int count=0,rem;
        while(n>0){
            rem=n%10;
             if (rem != 0 && num % rem == 0) {
                count++;
            }
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int ans=divideByDigit(4500);
        System.out.println(ans);
    }
    
}
