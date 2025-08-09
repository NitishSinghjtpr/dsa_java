public class findZeroInFact {
    static int trailingZeroes(int n) {
        // code here
        int count=0;
        while(n>=5){
            count+=n/5;
            n/=5;
        }
        return count;
    }
    public static void main(String[] args) {
        int ans= trailingZeroes(100);
        System.out.println(ans);
    }
}
