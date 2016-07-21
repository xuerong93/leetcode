/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int mid=(end-start)>>2+start;
            if(isBadVersion(mid)){
                //if(mid-1>=start && !isBadVersion(mid-1)) return mid;
                end=mid-1;
            } 
            else{
                //if(mid+1<=end && isBadVersion(mid+1)) return mid+1;
                start=mid+1;
            } 
        }
        return end+1 ;
    }
}