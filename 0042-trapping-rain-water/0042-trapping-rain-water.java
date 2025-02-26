class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] preMax = new int[n];
        int[] postMax = new int[n];
        int i=0; 
        int j=n-1;
        int premax = height[0];
        int postmax = height[n-1];
        int tot =  0;
        while(i<n && j>=0){
            if(height[i] > premax) premax=height[i];
            preMax[i]=premax;
            i++;
            if(height[j] >postmax) postmax=height[j];
            postMax[j]=postmax;
            j--;
        }
        for(int k=0; k<n; k++) tot+= Math.min(preMax[k], postMax[k]) - height[k];
        return tot;
    }
}