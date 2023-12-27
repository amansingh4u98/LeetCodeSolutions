class Solution {
    public int minCost(String colors, int[] neededTime) {
       int n = colors.length();
       int cnt = 0;
       for(int i=0; i<n-1; i++){
           int max = 0, sum = 0;
           char ch = colors.charAt(i);
           while(i+1 < n && colors.charAt(i+1) == ch){
                max = Math.max(Math.max(neededTime[i], neededTime[i+1]), max);
               sum += neededTime[i];
               i++;
           }
           if(sum!=0 && max!=0)
            sum += neededTime[i];
             
           cnt += (sum - max); 
       } 
       return cnt;
    }
}