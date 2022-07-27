// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static boolean isPalindrome(String s){
        int n = s.length();
        char[] str = s.toCharArray();
        for(int i=0; i<=n/2; i++){
            if (str[i]!=str[n-1-i]){
                return false;
            }
        }
        return true;
    }
}
