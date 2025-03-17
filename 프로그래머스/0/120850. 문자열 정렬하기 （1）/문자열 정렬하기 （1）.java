class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        for(int i = 0 ; i<my_string.length() ; i++){
            char str = my_string.charAt(i);
            if(str >= '0' && str <= '9'){
               count++;
            }
        }
        
        int[] answer = new int[count];
        int idx = 0;
        
        for(int i = 0 ; i<my_string.length(); i++){
            char str = my_string.charAt(i);
            if(str >= '0' && str <= '9'){
                answer[idx++] = str-'0';
            }
        }
        
        for(int i = 0 ; i < answer.length-1; i++) {
            for(int j = i+1; j <answer.length; j++) {
                if(answer[i] > answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }

            }
        }
        return answer;
    }
}
