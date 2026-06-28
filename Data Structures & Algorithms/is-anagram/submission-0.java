class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> frequencyMapS = new HashMap<>();
        Map<Character, Integer> frequencyMapT = new HashMap<>();
        int length = s.length();
        for(int i = 0; i < length; i++){
            char sChar = s.charAt(i);
            frequencyMapS.put(sChar, frequencyMapS.getOrDefault(sChar, 0) + 1);
            char tChar = t.charAt(i);
            frequencyMapT.put(tChar, frequencyMapT.getOrDefault(tChar, 0) + 1);
        }
        if(!frequencyMapS.equals(frequencyMapT)){
            return false;
        }
        return true;
    }
}
