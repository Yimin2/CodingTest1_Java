class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String stringAge = String.valueOf(age);
        for(int i=0; i<stringAge.length(); i++){
            sb.append((char)(stringAge.charAt(i) + 49));
        }
        return sb.toString();
    }
}