class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int len = s.length();
        boolean flag = true;
        int i=0,j=len-1;
        while(j>=i){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
                return flag;
            }
            i++;
            j--;
        }
        return flag;
    }
}