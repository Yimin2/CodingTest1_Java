import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String lowerStr = my_string.toLowerCase();
        char[] chars = lowerStr.toCharArray();
        Arrays.sort(chars);
        String answer = new String(chars);
        return answer;
    }
}