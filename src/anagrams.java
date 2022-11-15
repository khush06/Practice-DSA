public class anagrams {
    public static int size = 256;
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "sileot";
        if(isAnagram(s1,s2))
            System.out.print("Positive");
        else
            System.out.print("Negative");

    }

    public static boolean isAnagram(String s1, String s2)
    {
        int[] arr = new int[size];
        if(s1.length() != s2.length())
            return false;
        else{
            for(int i=0;i<s1.length();i++){
                arr[s1.charAt(i)]++;
                arr[s2.charAt(i)]--;
            }

            for (int i=0;i<size;i++){
                if(arr[i] != 0)
                    return false;
            }
            return true;
        }
    }
}
