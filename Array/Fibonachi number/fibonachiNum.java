import java.util.Scanner;

public class fibonachiNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        int[] arr = new int[1000];
        // int fibo;
         arr[0]=0;
         arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
            
        }
        System.out.println(arr[n-1]);
    }
    
}
