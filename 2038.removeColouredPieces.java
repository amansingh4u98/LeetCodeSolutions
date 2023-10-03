class Solution {
    public boolean winnerOfGame(String colors) {
        int l = colors.length();
        int cntA = 0, cntB = 0, currA = 0, currB = 0;
        if(colors.charAt(0) == 'A')
            currA++;
        else
            currB++;
        for(int i=1;i<l;i++){
          char ch = colors.charAt(i);
          if(ch == 'A' && currA > 0){
              currA++;
          }
          else if(ch == 'A' && currB > 0){
              if(currB >= 3)
                cntB += (currB - 2);
              
              currA++;
              currB = 0;
          }
          else if(ch == 'B' && currB > 0){
              currB++;
          }
          else if(ch == 'B' && currA > 0){
              if(currA >= 3)
                cntA += (currA - 2);
              
              currB++;
              currA = 0;
          }
        }
        if(currA >= 3)
            cntA += (currA - 2);
        if(currB >= 3)
            cntB += (currB - 2);

        //System.out.println("A: "+cntA+" B: "+cntB);
        if(cntA > cntB)
            return true;
        
        return false;
    }
}