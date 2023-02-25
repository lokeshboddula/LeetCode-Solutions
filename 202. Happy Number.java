class Solution {
    public boolean isHappy(int n) {
        //we store the squares of the number 
        //and if it repeats that number is not happy
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int sumOfSquares = 0;
            while (n > 0) {
                sumOfSquares += (n % 10) * (n % 10); 
                n /= 10;
            }
            n = sumOfSquares;
            if (sumOfSquares == 1) return true;
            if(set.contains(sumOfSquares)) return false;
            set.add(sumOfSquares);
        }
    }
}