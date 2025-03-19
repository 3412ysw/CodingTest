class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        
        for(int i = 0 ; i<my_string.length() ; i++){
            char str = my_string.charAt(i);
            
            if(Character.isUpperCase(str)){
               answer += Character.toLowerCase(str);
            }else if(Character.isLowerCase(str)){
               answer += Character.toUpperCase(str);
            }
        }
        
        return answer;
    }
}