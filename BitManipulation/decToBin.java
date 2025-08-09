public class decToBin {
    static void decToBin_1(){
        int num=1000001;
        int ans=0,mul=1,rem;
        while (num>0) {
            rem=num%10;
            ans=mul*rem+ans;
            num/=10;
            mul*=2;
            
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        decToBin_1();
    }
}
