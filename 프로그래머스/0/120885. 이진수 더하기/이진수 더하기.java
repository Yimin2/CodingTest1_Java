class Solution {
    public String solution(String bin1, String bin2) {
        int binInt1 = Integer.parseInt(bin1, 2);
        int binInt2 = Integer.parseInt(bin2, 2);
        
        int temp = binInt1 + binInt2;
        
        String answer = Integer.toBinaryString(temp);
        
        return answer;
    }
}