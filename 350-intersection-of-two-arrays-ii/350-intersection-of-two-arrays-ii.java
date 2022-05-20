class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         int length1 = nums1.length;
   ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for (int i=0; i<nums1.length; i++){
            if (map1.containsKey(nums1[i])){
                map1.put(nums1[i], map1.get(nums1[i])+1);
            } else {
                map1.put(nums1[i], 1);
            }
        }
             for (int i=0; i<nums2.length; i++){
            if (map2.containsKey(nums2[i])){
                map2.put(nums2[i], map2.get(nums2[i])+1);
            } else {
                map2.put(nums2[i], 1);
            }
        }
        
        for (Integer x : map1.keySet()){
            if (map2.containsKey(x)){
                int min = Math.min(map1.get(x), map2.get(x));
                while (min-- > 0){
                    list.add(x);
                }
            }
        }
        
        int[] arr = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}