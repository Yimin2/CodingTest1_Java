import java.util.Stack;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        StringBuilder sbBefore = new StringBuilder(before);
        StringBuilder sbAfter = new StringBuilder(after);
        
        for (int i = 0; i < sbAfter.length(); i++) {  
            for (int j = 0; j < sbBefore.length(); j++) 
                if (sbBefore.charAt(j) == sbAfter.charAt(i)) {
                    sbBefore.deleteCharAt(j);
                    break;
                }
            }
        
        if (sbBefore.length() == 0) {
            answer = 1;
        }
        
        return answer;
    }
}