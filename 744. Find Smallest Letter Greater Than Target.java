class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char potentialAns = letters[0];
        int s = 0; 
        int e = letters.length - 1;
        while(s <= e) {
            int mid = (s + e) / 2;
            if(letters[mid] > target) {
                potentialAns = letters[mid];
                e = mid - 1;
            } else if (letters[mid] < target) {
                s = mid + 1;
            } else {
                s = mid + 1;
            } 
        }
        return potentialAns;
    }
}