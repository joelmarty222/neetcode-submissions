
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < nums.length; i++){
            if (countMap.get(nums[i]) > 1){
                return true;
            }
        }
        return false;
        
    }
}
