class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       HashMap<Integer, Integer> intHashMap = new HashMap<>();

        int result = 0;

        for (int i = 0; i < nums.length; i++){
            result = target - nums[i];

            if (intHashMap.containsKey(result)){
                return new int[] {intHashMap.get(result), i};
            }
            intHashMap.put(nums[i], i);
            
        }
        return new int[0];


    }
}
