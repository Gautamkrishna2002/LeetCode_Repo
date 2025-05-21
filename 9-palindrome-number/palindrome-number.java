import java.util.*;
class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }

    
    public static boolean isPalindrome(int x) {
        if(x<0 || (x > 0 && x % 10 == 0)){
            return false;
        }
        else {
            int i = 0;
            for(; i<x; x /= 10){
                i = i * 10 + x % 10;
            }
            return x == i || x == i / 10;
        }
        
    }
}