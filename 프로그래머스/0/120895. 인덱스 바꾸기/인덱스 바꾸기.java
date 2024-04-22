class Solution {
    public String solution(String my_string, int num1, int num2) {
       StringBuilder answer = new StringBuilder(my_string);
        char firstNumber = answer.charAt(num1);
        char secondNumber = answer.charAt(num2);
        answer.setCharAt(num1, secondNumber);
        answer.setCharAt(num2, firstNumber);
        return answer.toString();
    }
}