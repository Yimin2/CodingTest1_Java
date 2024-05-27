class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i=0; i<sb.length(); i++){
            for(int j=sb.length()-1; j>i; j--) {
                if(sb.charAt(i)==sb.charAt(j)) {
                    sb. deleteCharAt(j);
                }
            }
        }
        return sb.toString();
    }
}