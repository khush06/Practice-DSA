public class NaivePatternSearch {
    public static void main(String[] args) {
        String s = "aaaaa";
        String pat = "aaa";
        for(int i=0;i<=s.length()-pat.length();i++){
            if(s.substring(i,i+pat.length()).equals(pat)){
                System.out.println(i);
            }
        }
    }
}
