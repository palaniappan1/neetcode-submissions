class Solution {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String str : strs){
            stringBuilder.append(str.length());
            stringBuilder.append("ß");
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        int length = 0;

        // Read the length
        while (str.charAt(i) != 'ß') {
            length = length * 10 + (str.charAt(i) - '0');
            i++;
        }

        // Skip '#'
        i++;

        // Read the string
        result.add(str.substring(i, i + length));
        i += length;
    }

    return result;
}
}
