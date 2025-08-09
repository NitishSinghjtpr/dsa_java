public class addDigitInSingleDigit {
    static void singleDigit(){
        int num=89765;
        while (num>9) {
         int rem,ans=0;
         while (num>0) {
            rem=num%10;
            ans+=rem;
            num/=10;

         }
         num=ans;

        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        singleDigit();
    }
}
