import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        int f=0,l=1,ans=0;
        System.out.println(f);
        System.out.println(l);
        for(int i=2;i<n;i++){
            ans=f+l;
            f=l;
            l=ans;
             System.out.println(ans);
        }
       
       
    }
    
}
