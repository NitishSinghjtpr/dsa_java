class Solution {
    static int[] plusOne(int []digits) {
        
       int n=digits.length;
       for(int i=n-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }else
        digits[i]=0;
       }
       int[] newArr= new int[n+1];
       newArr[0]=1;
       return newArr;
    }
    public static void main(String[] args) {
         int []digits={1,2,3};
        int ans=plusOne(digits);
       
        System.out.println(ans);

    }
    
}