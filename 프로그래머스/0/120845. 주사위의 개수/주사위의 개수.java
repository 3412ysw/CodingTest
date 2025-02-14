class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        answer= 
            ((box[0]-(box[0]%n))*(box[1]-(box[1]%n))
             *(box[2]-(box[2]%n)))/(n*n*n);
        
        return answer;
    }
}