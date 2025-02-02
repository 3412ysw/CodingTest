class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] size = emergency.clone();
    
        for(int i=0; i<size.length-1; i++) {
            for(int j=i+1; j<size.length; j++) {
                if(size[i]<size[j]) {
                    int temp = size[i];
                    size[i] = size[j];
                    size[j] = temp;
                }
            }
        }
        
        for(int i=0; i<size.length; i++) {
            for(int j=0; j<size.length; j++) {
                if(emergency[i] == size[j]) {
                    answer[i] = j+1;
                }
            }
        }
        return answer;
    }
}