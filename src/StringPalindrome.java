import java.util.Arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "abbcsbba";
        if(checkPalindrome(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

    public static boolean checkPalindrome(String s){
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s.charAt(i) == s.charAt(j))
                continue;
            else
                return false;
        }
        return true;
    }
}
