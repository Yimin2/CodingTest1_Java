import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] max = {array[0], 0};
        for(int i=1; i<array.length; i++){
            if(max[0] < array[i]){
                max[0] = array[i];
                max[1] = i;
            }
        }
        return max;
    }
}
