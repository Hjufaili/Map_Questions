import java.util.*;

class AnagramGrouper {
    /**
     * TO-DO: Group anagrams from the given array of strings.
     * \*
     *
     * @param strs An array of strings.
     * @return A List of Lists, where each inner list contains a group of anagrams.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        // Your code here:
        // Iterate through each string in 'strs'.
        // For each string, convert it to a char array, sort the array, and convert it back to a string.
        // This sorted string is your map key.
        // Use map.computeIfAbsent(key, k -> new ArrayList<>()).add(originalString) to add the original string to the list.

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

        }

        return new ArrayList<>(anagramMap.values());
    }
}