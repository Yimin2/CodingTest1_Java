class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numStr = Integer.toString(num);
        char target = Character.forDigit(k, 10);
        for(int i=0; i<numStr.length(); i++) {
        if(numStr.charAt(i) == target){
            answer = i+1;
           break;
        }
        }
        return answer;
    }
}