package Easy.E944;

public class Solution {
    public static int minDeletionSize(String[] strs) {
        int c = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j+1].charAt(i)){
                    c++;
                    break;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String[] arr = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(arr));
    }
}
