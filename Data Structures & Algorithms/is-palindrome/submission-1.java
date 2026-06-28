class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(!isAlphabet(s.charAt(start))){
                start++;
                continue;
            }
            if(!isAlphabet(s.charAt(end))){
                end--;
                continue;
            }
            char startChar = toLowerCase(s.charAt(start));
            char encChar = toLowerCase(s.charAt(end));
            if(startChar != encChar){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public char toLowerCase(char c){
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        } else {
            return c;
        }
    }

    public boolean isAlphabet(char c){
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||  (c >= '0' && c <= '9');
    }
}
