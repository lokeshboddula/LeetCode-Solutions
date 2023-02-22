class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        int curr = low;
        while (curr <= high) {
            if ((curr & 1) == 1) count++;
            curr++;
        }
        return count;
    }
}