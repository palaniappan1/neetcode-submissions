class Solution {
    public static char separator = '•';
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
            sb.append(separator);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(c != separator) {
                stringBuilder.append(c);
            }
            if(c == separator) {
                res.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        }
        return res;
    }
}
