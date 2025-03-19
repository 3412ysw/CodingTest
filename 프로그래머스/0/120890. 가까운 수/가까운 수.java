class Solution {
    public int solution(int[] array, int n) {
        int result = Math.abs(n - array[0]); // 최소 차이값 저장
        int answer = array[0]; // 가장 가까운 값 저장
        
        for(int i = 1 ; i<array.length ; i++){
            int temp = Math.abs(n-array[i]); 
            
            if(result>temp){
                result = temp; 
                answer = array[i]; 
            }else if(result==temp){
                answer = Math.min(answer, array[i]);
            }
        }
        
        
        return answer;
    }
}

