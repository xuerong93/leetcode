/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n<=0) return 0;
        if(isBadVersion(1)) return 1;
        int start=1;
        int end=n;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid+1<=end && !isBadVersion(mid) && isBadVersion(mid+1)) return mid+1;
            if(isBadVersion(mid)) end=mid;
            else start=mid;
        }
        return 0 ;
    }
}