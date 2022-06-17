class Solution {
    public int singleNumber(int[] nums) {
        
      List<Integer> no = new ArrayList<>();
        for (int i : nums){
           if (no.contains(i)){
               no.remove(new Integer(i));
           } else {
               no.add(i);
           }
        }
        return no.get(0);
    }
}