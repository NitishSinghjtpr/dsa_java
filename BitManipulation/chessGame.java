public class chessGame {
    public static int countHome(int a,int b){
        int count=0;
        count+=Math.min(8-a,8-b);
        count+=Math.min(8-a,8-b);
        count+=Math.min(8-a,8-b);
        count+=Math.min(8-a,8-b);
        return count;
    }
    
    
}
