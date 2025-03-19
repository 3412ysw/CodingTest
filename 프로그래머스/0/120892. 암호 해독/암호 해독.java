class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        String[] list = cipher.split("");
        
        for(int i = 0 ; i<list.length ; i++){
            if((i+1)%code==0){
                answer+=list[i];
            }
        }
        
        
        
        
        return answer;
    }
}