class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] list =  my_string.split("");
        
        for(int i = 0 ; i< list.length ; i++){
            if(!list[i].equals("a")&&!list[i].equals("i")&&!list[i].equals("o")
               &&!list[i].equals("e")&&!list[i].equals("u")){
                answer += list[i];
            }
        }
        
        return answer;
    }
}