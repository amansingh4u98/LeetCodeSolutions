class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;
        Arrays.sort(happiness);
        int n = happiness.length;
        int itr = 0;
        int ind = n-1;
        while(k-->0){
            if(itr == 0)
                sum += happiness[ind--];
            else{
                int t = happiness[ind] - itr;
                if(t<0)
                    t = 0;
                sum += t;
                ind--;
            }
            itr++;
        }
        return sum;        
    }
}