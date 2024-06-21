class Solution {
    public int solution(String my_string) {
        String[] parts = my_string.split(" ");
        int answer = Integer.parseInt(parts[0]);                
        for(int i = 0; i < parts.length; i++) {
            if(i%2!=0) {
                if(parts[i].equals("+")){
                    answer += Integer.parseInt(parts[i+1]);
                } else {
                    answer -= Integer.parseInt(parts[i+1]);
                }
            }
        }
        return answer;
    }
}
