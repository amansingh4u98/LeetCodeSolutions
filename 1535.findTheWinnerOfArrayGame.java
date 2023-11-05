class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        int first = arr[0], second = arr[1];
        int max = Math.max(first, second);
        int ind = 2;
        int winCnt = 1;
        while(ind<n && winCnt!= k){
            if(arr[ind]>max){
                max = arr[ind];
                winCnt = 1;
            }
            else{
                winCnt++;
            }
            ind++;
        }
        return max;
    }
}