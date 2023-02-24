class Solution {
    public int getSum(int a, int b) {
        // we store the carry in b and answer in a;
        // a ^ b performs addition and a & b get the carry 
        // (a & b) << 1 gives the postion to add the carry 
        // we store the carry in temp variable before XOR to 
        //consider the orginal value of a before addition

        while ( b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
    return a;
    }
}