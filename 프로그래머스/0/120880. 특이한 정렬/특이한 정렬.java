import java.util.Arrays;
class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
            .boxed()
            .sorted ((a, b) -> {
                int distA = Math.abs(n-a); 
                int distB = Math.abs(n-b);
                
                if(distA == distB) {
                    return b-a;
                } else {
                  return distA - distB;  
                }
            })
            .mapToInt(Integer::intValue)
            .toArray();
    }
}