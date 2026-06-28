class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if(sLength != tLength){
            return false;
        }
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for(int i =0; i < sLength; i++){
            sArray[s.charAt(i)-'a']++;
            tArray[t.charAt(i)-'a']++;
        }
        return Arrays.equals(sArray, tArray);
    }
}
