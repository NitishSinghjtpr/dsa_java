import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
         System.out.println("Enter number n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
