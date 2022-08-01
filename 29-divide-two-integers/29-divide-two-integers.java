class Solution {
    public int divide(int dividend, int divisor) {
        int s=0;
        if (dividend < 0 && divisor <0){
            s = (dividend/divisor);
            if (s == -2147483648)
                s = 2147483647;
        }
        if (dividend>0 || divisor>0){
        s = (dividend/divisor);
        if (s > 2147483647)
            s = 2147483647;
        else if(s< -2147483648)
            s = -2147483648;
        /**else if (s == -2147483648)
            s = 2147483647;**/ 
        }
        
    return s;
    }
}