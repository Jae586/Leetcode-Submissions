class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<magazine.length(); i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i),0)+1);
            
        }
        for (int i=0; i<ransomNote.length(); i++){
            char opp = ransomNote.charAt(i);
            if (map.getOrDefault(opp,0) != 0){
                map.put(opp, map.get(opp)-1);
            } else {
                return false;
            }
        }
      return true;
    }
}