class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        int cal = 0;
        for(int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++){
                cal = numbers[i]*numbers[j];
                if(answer < cal) {
                    answer = cal;
                }
        }
    }
    return answer;
    }
}