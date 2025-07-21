package math;

public class countOfDigit {
    public static void main(String[] args) {
        int n=9615;
        int count=0;
        while (n>0) {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
