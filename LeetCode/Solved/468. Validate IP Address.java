package LeetCode.Solved;
class Solution {
    public String validIPAddress(String queryIP) {
        String IP4Pattern = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
        String IP6Pattern = "^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";
        if (queryIP.matches(IP4Pattern)) return "IP4";
        if (queryIP.matches(IP6Pattern)) return "IP6";
        return "Neither";
    }
    public void main(String[] args) {
        System.out.println(validIPAddress("172.16.254.1"));
    }
}