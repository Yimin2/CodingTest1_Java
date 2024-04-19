class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string);
        for(int i=0; i<answer.length(); i++) {
            if(answer.charAt(i) == 'a' || answer.charAt(i) == 'e' || answer.charAt(i) == 'i' || answer.charAt(i) == 'o' || answer.charAt(i) == 'u') {
                answer.deleteCharAt(i);
                i--;
            } 
        }
        return answer.toString();
    }
}