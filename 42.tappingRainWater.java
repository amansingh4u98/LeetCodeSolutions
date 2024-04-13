class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] leftMax = getLeftMax(height, n);
        int[] rightMax = getRightMax(height, n);
        int area = 0;
        for(int i=0; i<n; i++){
            int h = Math.min(leftMax[i], rightMax[i]) - height[i];
            area += h;
        }
        return area;
    }

    public int[] getLeftMax(int[] height, int n){
        int[] arr = new int[n];
        arr[0] = height[0];

        for(int i=1; i<n; i++){
            arr[i] = Math.max(arr[i-1], height[i]);
        }

        return arr;
    }

    public int[] getRightMax(int[] height, int n){
        int[] arr = new int[n];
        arr[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            arr[i] = Math.max(arr[i+1], height[i]);
        }

        return arr;
    }
}