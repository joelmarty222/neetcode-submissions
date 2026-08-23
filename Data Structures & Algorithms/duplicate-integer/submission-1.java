class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> checker = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (checker.containsKey(nums[i])){
                return true;
            } else {
                checker.put(nums[i], i);
            }
        }
        return false;
    }
}