import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        for(int i=0; i<sides[1]; i++){
         if(sides[1]<=i+sides[0]){
            answer++;   
         }
        }
        for(int j=sides[1]+1; j<sides[0]+sides[1]; j++){
         answer++;
        }
        return answer;
    }
}
