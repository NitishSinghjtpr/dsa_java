public class chessCamel{
    
    public static int countHome(int a,int b){
        int count=0;
        count+=Math.min(8-a,8-b);
        count+=Math.min(8-a,b-1);
        count+=Math.min(a-1,8-b);
        count+=Math.min(a-1,b-1);
        return count;
    }
    public static void main(String[] args) {
        int ans=countHome(5, 01);
        System.out.println(ans);
    }
    
    
}
