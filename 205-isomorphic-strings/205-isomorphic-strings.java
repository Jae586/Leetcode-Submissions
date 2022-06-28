class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sDict = new int[256];
        Arrays.fill(sDict, -1);
        
        int[] tDict = new int[256];
        Arrays.fill(tDict, -1);
        
        for (int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (sDict[c1] == -1 && tDict[c2] == -1){
                sDict[c1] = c2;
                tDict[c2] = c1;
            } else if (!(sDict[c1] == c2 && tDict[c2] == c1)){
                return false;
            }
        }
        return true;
    }
}