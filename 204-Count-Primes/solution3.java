public class Solution {
    public int countPrimes(int n) {
        if (n<=2) return 0;
        boolean[] res=new boolean[n];
	    int sum = 1;
		for (int i=3; i<n; i+=2) {
		    if (!res[i]) {//
			    sum++;
			    //avoid overflow
			    if(i*i>=n) continue;
			    for (int j=i*i; j<n; j+=i) {
				    res[j] = true;
			    }
		    }
	    }
	    return sum;
    }
}