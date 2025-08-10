public class NimGame {
    public static boolean canWinNim(int n) {
        //Iss condition me jo pahle start karega wo jitega!
        if(n%4!=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canWinNim(33));
    }
    
}
