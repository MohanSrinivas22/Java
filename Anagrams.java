
import java.util.*;

class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(areAnagrams(s1, s2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static boolean areAnagrams(String s1, String s2){
        int n1 = s1.length(), n2 = s2.length();
        if(n1!=n2) return false;
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0; i<n1; i++){
            if (str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
}
