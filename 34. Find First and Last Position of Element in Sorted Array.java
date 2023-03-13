class Solution {
    public int firstOccurance(int a[], int n, int k){
		int low = 0;
		int high = n - 1;
		int fo = -1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(a[mid] == k) {
				fo = mid;
				high = mid - 1;
			} else if(a[mid] > k) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return fo;
	}
    public int lastOccurance(int a[], int n, int k){
		int low = 0;
		int high = n - 1;
		int lo = -1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(a[mid] == k) {
				lo = mid;
				low = mid + 1;
			} else if(a[mid] > k) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return lo;
	}
    public int[] searchRange(int[] nums, int k) {
        int fo = -1, lo = -1;
		fo = firstOccurance(nums, nums.length, k);
		lo = lastOccurance(nums, nums.length, k);
		int[] ans = new int[2];
        ans[0] = fo;
        ans[1] = lo;
        return ans;
    }
}