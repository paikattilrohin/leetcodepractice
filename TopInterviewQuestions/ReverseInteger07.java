class Solution {
    public int reverse(int x) {
        int ans = 0;
        int lastDigit = 0;
        while(x != 0){
            lastDigit = x%10;
            if(ans < Integer.MAX_VALUE/10 && ans > Integer.MIN_VALUE/10){
                ans = ans*10 + lastDigit;
            }
            else if(ans == Integer.MAX_VALUE/10 && lastDigit <= 7){
                ans = ans*10 + lastDigit;
            }
            //                          remember it's -8 and not 8
            else if(ans == Integer.MIN_VALUE/10 && lastDigit >= -8){
                ans = ans*10 + lastDigit;
            }
            else{
                return 0;
            }
            x/=10;
        }
        return ans;
    }
}