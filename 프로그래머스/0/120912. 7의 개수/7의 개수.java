class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int x = 0;
        while (x < array.length) {
            if (array[x] > 0) {        
                if (array[x]%10 == 7) {
                    answer++;
                }
                array[x] /= 10;
            } else {
                x++;
            }   
        }
        return answer; 
    }
}
