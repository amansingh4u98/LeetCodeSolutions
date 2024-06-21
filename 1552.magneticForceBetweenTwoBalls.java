class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int l = 1, r = position[n-1]-position[0];
        int res = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(possibleToPlace(mid, position, m)){
                res = mid;
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return res;
    }

    public boolean possibleToPlace(int force, int[] position, int m){
        int prev = position[0];
        int cnt = 1;
        for(int i=1; i<position.length; i++){
            int curr = position[i];
            if(curr - prev >= force){
                cnt++;
                prev = curr;
            }
            if(cnt == m)
                break;
        }
        return cnt == m;
    }
}