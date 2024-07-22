class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while (count < n) {
            answer++;
            if (three(answer)) {
                count++;
            }
        }
        return answer;
    }
    
    private boolean three(int num) {
        if (num % 3 == 0) {
            return false;
        }
        
        while (num > 0) {
            if (num % 10 == 3) {
                return false;
            }
            num /= 10;
        }
        
        return true;
    }
}
