import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();
        int m = 2;
        
        
        while (n > 1) {
            if (n % m == 0) {
                n = n / m;
                factors.add(m);
            }
            else {
            m++;
            }
        }
        int[] answer = factors.stream().distinct().mapToInt(i -> i).toArray();
        return answer;
    }
}
