class Solution {
    public boolean isPalindrome(int x) {
        int t=0;
        int r,a;
        a = x;
        while (x > 0){
            r = x % 10;
            t = (t * 10) + r;
            x = x / 10;
     }
        
     if (a == t){
            return true;
    }
        else{
        return false;
    }
}
}