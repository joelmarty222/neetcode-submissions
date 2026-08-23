class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (numberMap.containsValue(nums[i])){
                return true;
            }
            numberMap.put(i, nums[i]);
        }

        return false;
    }
}