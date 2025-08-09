public class binToDec{
    static void binToDec_1(){
        int num=729;
        int rem,ans=0,mul=1;
        while (num>0) {
            rem=num%2;
            num=num/2;
            ans=rem*mul+ans;
            mul*=10;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        binToDec_1();
    }
} 