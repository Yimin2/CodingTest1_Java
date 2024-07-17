import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] averages = new int[score.length];
        int[] answer = new int[score.length];
        
        for(int i=0; i<score.length; i++) {
            averages[i] = score[i][0]+score[i][1];
        }
        
        int[] sortedAverages = averages.clone();
        Arrays.sort(sortedAverages);
        
        for(int i=0; i<score.length; i++) {
            int rank = 1;
            for(int j=score.length-1; j>=0; j--) {
                if(averages[i] == sortedAverages[j]) {
                    answer[i] = rank;
                    break;
                    }
                rank++;
                }
            }
                return answer;
        }
}
