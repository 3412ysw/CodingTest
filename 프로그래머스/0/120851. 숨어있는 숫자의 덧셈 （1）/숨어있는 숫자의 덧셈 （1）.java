class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0 ; i<my_string.length(); i++){
            char str = my_string.charAt(i);
            if(str >= '0' && str <= '9'){
                answer += str-'0';
            }
        }
        
        return answer;
    }
}