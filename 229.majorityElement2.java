class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int k = (int)Math.floor(n/3);
       
        for(int i : nums){
            if(map.containsKey(i)){
                int temp = map.get(i);
                temp++;
                if(temp > k)
                {
                    if(!ans.contains(i))
                        ans.add(i);
                }
                
                map.put(i, temp);
            }
            else{
                map.put(i, 1);
                if(1 > k)
                {
                    if(!ans.contains(i))
                        ans.add(i);
                }
            }        
        }
        return ans;
    }
}