class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xMin = dots[0][0];
        int yMin = dots[0][1];
        int xMax = dots[0][0];
        int yMax = dots[0][1];
        
        for(int i=0; i<dots.length; i++){
            xMin = Math.min(xMin, dots[i][0]);
            yMin = Math.min(yMin, dots[i][1]);
            xMax = Math.max(xMax, dots[i][0]);
            yMax = Math.max(yMax, dots[i][1]);
        }
        
        answer = (xMax-xMin)*(yMax-yMin);
        return answer;
    }
}

