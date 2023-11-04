class Solution {
    public List<String> buildArray(int[] target, int n) {
        int ind = 0;
        int len = target.length;
        List<String> list = new ArrayList<>();
        String push = "Push", pop = "Pop";
        Stack<Integer> st = new Stack<>();

        for(int i=1; i<=n; i++){
            st.push(i);
            list.add(push);

            if(ind<len){
                if(st.peek() != target[ind]){
                    st.pop();
                    list.add(pop);
                }
                else{
                    ind++;
                }
            }
            if(ind == len)
                break;
        }

        return list;
    }
}