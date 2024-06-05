import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] copyArray = Arrays.copyOf(array, array.length+1);
        copyArray[copyArray.length-1] = n;
        Arrays.sort(copyArray);
        for(int i=0; i < copyArray.length; i++) {
            if(copyArray[i] == n) {
                if (i==0) {
                    answer = copyArray[i+1];
                }
                else if (i == copyArray.length-1){
                    answer = copyArray[i-1];
                }
                else if(n - copyArray[i-1] <= copyArray[i+1] - n){
                    answer = copyArray[i-1];
                } 
                else {
                    answer = copyArray[i+1];
                }
                break;
            }
        }
        return answer;
    }
}
    
    
    