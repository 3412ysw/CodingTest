class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] list = my_string.split("");
        
        for(int i = 0 ; i<list.length ; i++){
            if(!answer.contains(list[i])){
                answer+=list[i];   
            }
        }
        
        return answer;
    }
}