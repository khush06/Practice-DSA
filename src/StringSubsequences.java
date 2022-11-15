public class StringSubsequences {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "";
        //Recursive soln
        if(recursiveFun(s1,s2,s1.length(),s2.length()))
            System.out.println("follows");
        else
            System.out.println("Not follows");
        //Iterative soln
        if(checkSubsequence(s1,s2))
            System.out.println("follows");
        else
            System.out.println("Not follows");

    }
    public static boolean checkSubsequence(String s1, String s2){
        int j = 0;
        for(int i=0;i<s1.length() && j<s2.length();i++){
            if(s2.charAt(j) == s1.charAt(i))
            {
                j++;
            }
        }
        return (j==s2.length());
    }

    public static boolean recursiveFun(String s1,String s2,int n,int m){
        if(m == 0)
            return true;
        if(n == 0)
            return false;
        if(s1.charAt(n-1) == s2.charAt(m-1))
            return recursiveFun(s1,s2,n-1,m-1);
        else
            return recursiveFun(s1,s2,n-1,m);
    }
}
