class Solution {
    public int[] solution(int money) {
        int cul = money/5500;
        int[] answer = {cul, money-cul*5500};
        return answer;
    }
}