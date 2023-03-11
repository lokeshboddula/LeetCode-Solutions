/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            //Binary Search
            int ans = 0;
            int low = 0;
            int high = n;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(isBadVersion(mid) && !isBadVersion(mid - 1)) {
                    return mid;
                } else if (isBadVersion(mid)){
                     high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    }