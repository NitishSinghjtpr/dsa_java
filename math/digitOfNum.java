package math;

public class digitOfNum {
    public static void main(String[] args) {
        int n=9615;
        int count=0;
        while (n>0) {
            int a=n%10;
            count =a;
            n=n/10;
        }
        System.out.println(count);
    }
}
