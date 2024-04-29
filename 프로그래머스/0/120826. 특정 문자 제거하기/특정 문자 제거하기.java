class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i)==letter.charAt(0)){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}