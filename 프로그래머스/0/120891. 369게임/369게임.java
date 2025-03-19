class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] list = (String.valueOf(order)).split("");
        
        for(int i = 0 ; i<list.length ;i++){
            if(list[i].equals("3")||list[i].equals("6")||list[i].equals("9")){
                answer++;
            }
        }
        
        return answer;
    }
}