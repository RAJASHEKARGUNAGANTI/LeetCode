class Solution {
    public int reverse(int x) {
        long t=0;
        int r,a=0;
        if (x<0 ){
            while(x != 0){
            r = x % 10;
            t = (t * 10) + r;
            x = x / 10;
            }
            if(t>= -2147483648){
                System.out.println("-");
            a=(int)t;
        }}
        else if(x>0){
            while(x != 0){
            r = x % 10;
            t = (t * 10) + r;
            x = x / 10;
            }
            if(t<= 2147483647)
              a=(int)t;
        }
        else{
            return 0;
        }
    return a; 
    }
}