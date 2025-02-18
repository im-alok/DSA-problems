class Solution {
    public boolean digitCount(String num) {
        //to store count
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count occurrences of each digit
        for (char c : num.toCharArray()) {
            int digit = Character.getNumericValue(c);
            mp.put(digit, mp.getOrDefault(digit, 0) + 1);
        }

        // Validate digit counts
        for (int i = 0; i < num.length(); i++) {
            int expectedCount = Character.getNumericValue(num.charAt(i));
            if (mp.getOrDefault(i, 0) != expectedCount)
                return false;
        }

        return true;
    }
}