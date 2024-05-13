class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%6 == 0) {
            answer = n/6;
        }
        else{
            for(int i=1; i<=1000; i++){
                if(6*i%n==0){
                    return answer = i;
                }
            }
        }
        return answer;
    }
}