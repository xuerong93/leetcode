/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int mid;
        while(start<=end){
            mid=((end-start)>>1)+start;
            if(isBadVersion(mid)){
                if(mid-1>=start && !isBadVersion(mid-1)) return mid;
                end=mid-1;
            } 
            else{
                if(mid+1<=end && isBadVersion(mid+1)) return mid+1;
                start=mid+1;
            } 
        }
        return end+1 ;
        
        
        /*int start = 1;  
        int end = n;  
        int middle;  
        while(start <= end){  
            middle = ((end - start)>>1) + start;  
            if (isBadVersion(middle)) end = middle-1;  
            else start = middle+1;  
        }  
        return end+1; */
    }
}