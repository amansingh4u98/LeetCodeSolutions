class Solution {
    public int numberOfBeams(String[] bank) {
        int cnt = 0;
        boolean firstElem = true;
        int prev = 0;
        for(String s : bank){
            int temp = countOnes(s);
            if(firstElem && temp > 0){
                prev = temp;
                firstElem = false;
            }
            else if(!firstElem && temp > 0){
                cnt += prev * temp;
                prev = temp;
            }
        }
        
        return cnt;
    }

    public int countOnes(String s){
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                cnt++;
            }
        }
        return cnt;
    }
}