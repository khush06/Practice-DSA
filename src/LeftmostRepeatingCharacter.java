import java.util.Arrays;

public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abdfaec";
        int result = -1;
        boolean[] visited = new boolean[256];

        //First repeating element
        for (int i = s.length() - 1; i >= 0; i--) {
            if (visited[s.charAt(i)])
                result = i;
            else
                visited[s.charAt(i)] = true;
        }
        System.out.println("repeating "+result);


        //First non-repeating element     babdfaec
        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        int res = Integer.MAX_VALUE;
        for (int i = 0;i<s.length();i++) {
            if (arr[s.charAt(i)] == -1)
                arr[s.charAt(i)] = i;
            else
                arr[s.charAt(i)] = -2;
        }
        for (int i = 0;i<256;i++) {
            if(arr[i]>=0)
                res = Math.min(res,arr[i]);
        }
        System.out.print("non-repeating ");
        System.out.println(res == Integer.MAX_VALUE?-1:res);
    }
}
