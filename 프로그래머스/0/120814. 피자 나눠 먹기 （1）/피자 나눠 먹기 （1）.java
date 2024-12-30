class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;
        while(true){
            if(7*pizza >= n ){
            break;
            }else{
                pizza++;
            }
                
        }
        return pizza;
    }
}