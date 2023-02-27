class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            int  timesItOccurs = (i + 1) * (arr.length - i);
            if(timesItOccurs % 2 == 1) {
                sum += ((timesItOccurs/2) + 1) * arr[i];
            } else {
                sum += (timesItOccurs/2) * arr[i];
            }
        }
        return sum;
    }
}