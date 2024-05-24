import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String number = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[number.length()];
        for(int i=0; i<number.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        Arrays.sort(answer);
        return answer;
    }
}