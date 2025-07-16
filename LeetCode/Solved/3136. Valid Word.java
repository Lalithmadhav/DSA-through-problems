import java.util.Set;

class Solution {

    public static boolean isValid(String word) {
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        boolean hasVowel = false, hasConsonant = false;
        if(word.length()<3) return false;
        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (vowels.contains(c)) {
                hasVowel = true;
            }else if (Character.isLetter(c)) {
                hasConsonant = true;
            }
        }
        return hasVowel && hasConsonant;
    }
    public static void main(String[] args) {
        System.out.println(isValid("Lla4"));
    }
}

// 48 - 57
// 65 - 90
// 97 - 122