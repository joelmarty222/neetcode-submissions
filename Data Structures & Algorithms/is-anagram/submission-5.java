class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        HashMap<Character, Integer> sCountMap = new HashMap<>();
        HashMap<Character, Integer> tCountMap = new HashMap<>();

        for (int i = 0; i < sChar.length; i++){
            sCountMap.put(sChar[i], sCountMap.getOrDefault(sChar[i], 0) + 1);
        }

         for (int i = 0; i < tChar.length; i++){
            tCountMap.put(tChar[i], tCountMap.getOrDefault(tChar[i], 0) + 1);
        }

       if (sCountMap.equals(tCountMap)){
        return true;
       }
       return false;
    }
}