class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int currentWords = words.length; 
            if (currentWords > maxWords) {
                maxWords = currentWords;
            }
        }
        return maxWords;
    }
}