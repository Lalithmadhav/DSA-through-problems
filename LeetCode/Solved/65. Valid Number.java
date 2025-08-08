package LeetCode.Solved;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public boolean isNumber(String s) {
        Pattern validNumber = Pattern.compile("^[+-]?((\\d+(\\.\\d+)?)|(\\.\\d+))([eE][+-]?\\d+)?$");
        // ^[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))([eE][+-]?\\d+)?$
        Matcher isMatch = validNumber.matcher(s.trim());
        return isMatch.matches();
    }
    public void main(String[] args) {
        System.out.println(isNumber("."));
    }
}