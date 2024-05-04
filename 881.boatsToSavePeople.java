class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0, r = people.length-1;
        int boats = 0;
        while(l<=r){
            if(people[r] == limit)
            {
                boats++;
                r--;
            }
            else if(people[r] < limit){
                if(people[l] + people[r] <= limit){
                    boats++;
                    l++;
                    r--;
                }
                else{
                    boats++;
                    r--;
                }
            }
        }
        return boats;
    }
}