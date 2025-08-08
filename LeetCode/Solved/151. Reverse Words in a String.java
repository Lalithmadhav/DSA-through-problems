import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String reverseWords(String s) {
        String[] sArray = s.trim().split("\s+");
        List<String> wordArray = Arrays.asList(sArray);
        Collections.reverse(wordArray);
        String reversed = String.join(" ", wordArray);
        return reversed;
    }
    public void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}