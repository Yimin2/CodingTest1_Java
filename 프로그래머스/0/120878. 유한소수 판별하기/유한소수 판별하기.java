class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        b /= gcd(a,b);
        
        while(b % 2 == 0) {
            b /= 2;
        }
        
        while(b % 5 == 0) {
            b /= 5;
        }
        
        if (b == 1) {
            answer = 1;
        }
        return answer;
    }
    
    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}