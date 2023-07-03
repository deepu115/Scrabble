public class Scrabble {
    String word;
    public Scrabble(String word){
        this.word = word;
    }
    public int score() {
        if (this.word == null || this.word.isEmpty()) {
        }
        return 0;
    }
}
