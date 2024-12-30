class Solution {
    public int solution(int n) {
        int pizza = 1;
        while(true){
        if((6*pizza)%n==0){
            break;
        }else{
            pizza++;
        }
        
        
        }
        return pizza;
    }
}