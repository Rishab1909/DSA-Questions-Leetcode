class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String compare = strs[i];

            int index = 0;

            while (index < prefix.length() && index < compare.length()
                    && prefix.charAt(index) == compare.charAt(index)) {
                index++;
            }

            prefix = prefix.substring(0, index);
        }
        return prefix;
    }
}