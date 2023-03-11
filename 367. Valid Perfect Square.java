class Solution {
    public boolean isPerfectSquare(int num) {
        //Brute Force // non-working
        // int i = 0;
        // for(; i * i < num; i++) {}
        // if(i * i == num) return true;
        // return false;
        int low = 1;
        int high = num;
        while(low <= high) {
            long mid = (low + high) / 2;
            if(mid * mid == num) return true;
            else if(mid * mid > num) high = (int)(mid - 1);
            else low = (int) (mid + 1);
        }
        return false;
    }
}