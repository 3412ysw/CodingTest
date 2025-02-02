class Solution {
    public String solution(String letter) {
        String array[]= letter.split(" ");
        String answer = "";
        String[] arr = 
		 {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--"
			 ,"-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				if(array[i].equals(arr[j])) {
					answer += (char)(j+97);
				}
			}
		}
        return answer;
    }
}