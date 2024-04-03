package Leetcode.demoo;

public class Solution2 {
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int ans = 0;

        for (int i = 0; i < needle.length(); i++) {
            for (int j = 0; j < haystack.length(); j++) {
                if (haystack.charAt(j) != needle.charAt(i)) {
                    return -1;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leet";

        System.out.println(strStr(haystack, needle));
        System.out.println("test");
    }
}
