class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int l=0;
        while(i<=j) {
            l=i;
            while(l>0) {
                if(l%10 == k) {
                    answer++;
                } 
               l/= 10;
            }
            i++;
        }
        return answer;
    }
}