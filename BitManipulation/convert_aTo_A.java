import java.util.Scanner;

public class convert_aTo_A {
      static char convert(char name){
        char ans= (char)(name - 'A' + 'a') ;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char name=sc.next().charAt(0);
        char ans=convert(name);
        System.out.println(ans);
        sc.close();
    }
    
}
