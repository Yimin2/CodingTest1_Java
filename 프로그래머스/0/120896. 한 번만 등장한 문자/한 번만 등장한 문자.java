import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        List<Character> uniqueChars = new ArrayList<>();
        
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) == 1) {
                uniqueChars.add(c);
            }
        }
        
        Collections.sort(uniqueChars);
        
        StringBuilder answer = new StringBuilder();
        
        for (char c : uniqueChars) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}
