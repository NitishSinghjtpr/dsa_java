public class leapYear {
    static void checkLeapYear(){
        int num=1300;
        if (num%400==0) {
            System.out.println("leapYear");
        }
        else if(num%4==0 && num%100!=0)
        {
            System.out.println("leapYear");
        }
        else{
            System.out.println("not leapYear");
        }
    }
    public static void main(String[] args) {
        checkLeapYear();
    }
    
}
