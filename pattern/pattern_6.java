import java.util.Scanner;

public class pattern_6 {
     public static void main(String[] args) {
        System.out.println("Enter number n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        //outer loop for rows
        for(int i=n;i>=1;i--){

            // loop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //loop for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for next line
            System.out.println();
        }
    }
}
