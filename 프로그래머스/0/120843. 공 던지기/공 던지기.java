class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<k; i++) {
            count += 2;
            answer = count-1;
            if(count>=numbers.length){
                count -= numbers.length;
            }
        }
        return answer;
    }
}
