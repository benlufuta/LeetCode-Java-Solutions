class Solution {
    public boolean isAnagram(String s, String t) {
        

        //First Working solution that came mind. Not as efficient.
        //More efficient to be implement soon...
        HashMap<Character, Integer> sCharFrequencyMap = new HashMap<>();
        HashMap<Character, Integer> tCharFrequencyMap = new HashMap<>();

        //Convert given String values to array of char Values.
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        //Go through first char array and store char and value.
        for (int i = 0; i < sChars.length; i++) {

            char c = sChars[i];

            if (!sCharFrequencyMap.containsKey(c)) {

                sCharFrequencyMap.put(c, 1);

            } else {

                sCharFrequencyMap.merge(c, 1, Integer::sum);
            }
        }

        /Go through second char array and store char and value.
        for (int i = 0; i < tChars.length; i++) {

            char c = tChars[i];

            if (!tCharFrequencyMap.containsKey(c)) {

                tCharFrequencyMap.put(c, 1);

            } else {

                tCharFrequencyMap.merge(c, 1, Integer::sum);
            }
        }

        //return true if equal, otherwise false.
        return sCharFrequencyMap.equals(tCharFrequencyMap);
    }
}