import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();//converts them into arrays of characters.
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);//ascending order
        Arrays.sort(tChar);//['a', 'a', 'a', 'g', 'm', 'n', 'r']

        return Arrays.equals(sChar,tChar);
    }
}