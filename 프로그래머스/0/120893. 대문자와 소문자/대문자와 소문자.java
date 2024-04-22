class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string);
        for(int i=0; i<answer.length(); i++){
            char currentNumber = answer.charAt(i);
            if(Character.isUpperCase(currentNumber)){
                answer.setCharAt(i, Character.toLowerCase(currentNumber));
            }
            else{
                answer.setCharAt(i, Character.toUpperCase(currentNumber));
            }
        }            
        return answer.toString();
    }
}