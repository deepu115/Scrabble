public class Scrabble {
    private String word;
    public Scrabble(String word){
        this.word = word;
    }
    public int score() {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        int score = 0;
        for (char c : word.toCharArray()) {
            score += LettersMap.getScore(c);
        }
        return score;
    }
}
