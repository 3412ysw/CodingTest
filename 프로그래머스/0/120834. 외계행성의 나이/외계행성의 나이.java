class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
		for(int i = 0 ; i < str.length() ; i++) {
			answer+= (char)((int)str.charAt(i)+49);
		}
        return answer;
    }
}