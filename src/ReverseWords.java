public class ReverseWords {
    public static void main(String[] args) {
        String s = " I am ";
        reverse(s);
    }

    //Aprroach 1 - I am homo sapien
    // reverse letters of all words - I ma omoh neipas
    // reverse the whole string - sapien homo am I
    public static void reverse(String s){
        String res = "";
        int lastIndex = s.length();
        for(int i = s.length()-1;i>=0;i--) {
            if(s.charAt(i) == ' '){
             res = res +s.substring(i+1,lastIndex)+' ';
             lastIndex = i;
            }
            if(s.charAt(i) != ' ' && i == 0){
                res = res + s.substring(0,lastIndex);
            }
        }
        System.out.println(res);
    }
}
