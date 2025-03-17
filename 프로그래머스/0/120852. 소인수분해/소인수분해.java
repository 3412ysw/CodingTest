class Solution {
    public int[] solution(int n) {
        int[] temp = new int[10];
        int idx = 0;
        for(int i = 2 ; i<=n ;i++ ){
            if(n%i==0){
                temp[idx++]=i;
                while(n%i==0){
                n = n/i;      
                }
            }
        }
        
        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++) {
            answer[i] = temp[i];
        }
        
        return answer;
        
    }
}