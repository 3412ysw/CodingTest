class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0 ; i < strlist.length ; i++){
            String[] list = strlist[i].split("");
            answer[i] = list.length;
        }
        
        return answer;
    }
}