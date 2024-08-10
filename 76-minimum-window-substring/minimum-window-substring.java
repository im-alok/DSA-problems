
class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        HashMap<Character, Integer> ani = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();

        // Populate the ani map with frequency of characters in t
        for (char c : t.toCharArray()) {
            ani.put(c, ani.getOrDefault(c, 0) + 1);
        }

        int minLen = Integer.MAX_VALUE;
        int range1 = -1, range2 = -1;
        int got = 0, left = 0;

        // Iterate over the string s
        for (int right = 0; right < s.length(); right++) {
            char key = s.charAt(right);
            if (ani.containsKey(key)) {
                have.put(key, have.getOrDefault(key, 0) + 1);

                // Only increase `got` when we meet the required frequency in `have`
                if (have.get(key).equals(ani.get(key))) {
                    got++;
                }
            }

            // When we have all the characters needed
            while (got == ani.size()) {
                // Update the minimum window if the current one is smaller
                if (minLen > right - left + 1) {
                    minLen = right - left + 1;
                    range1 = left;
                    range2 = right + 1;
                }

                char del = s.charAt(left);
                if (ani.containsKey(del)) {
                    have.put(del, have.get(del) - 1);
                    // Decrease `got` only if we drop below the required frequency
                    if (have.get(del) < ani.get(del)) {
                        got--;
                    }
                }
                left++;
            }
        }

        return range1 == -1 ? "" : s.substring(range1, range2);
    }
}
