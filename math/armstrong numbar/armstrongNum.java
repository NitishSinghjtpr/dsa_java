import java.util.Scanner;


public class armstrongNum {
    static int findDigit(int num){
         //find digit
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    static boolean armstrong(int num, int digit){
        int n=num,rem,ans=0;
        while (n>0) {
            rem=n%10;
            n/=10;
            ans+=Math.pow(rem,digit);
        }
        if(ans==num){
            return true;
        }
        return false;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int d= findDigit(num);
       System.out.println(armstrong(num,d));
       sc.close();
    }
   
    
}
