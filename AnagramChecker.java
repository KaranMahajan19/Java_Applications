import java.util.Arrays;

public class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove any whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        // Example usage
        String string1 = "listen";
        String string2 = "silent";
        
        if (areAnagrams(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }
}
