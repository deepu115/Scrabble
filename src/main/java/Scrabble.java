

public class Scrabble {
    private String word;
    private Character[] doubleLetter;
    private Character[] tripleLetter;
    boolean doubleWord;
    boolean tripleWord;

    public Scrabble(String word){

        this.word = word;
    }
    public Scrabble(String word,Character[] doubleLetter,Character[] tripleLetter,boolean doubleWord,boolean tripleWord){

        this.word = word;
        this.doubleLetter=doubleLetter;
        this.tripleLetter=tripleLetter;
        this.doubleWord=doubleWord;
        this.tripleWord=tripleWord;
    }
    public int score() {
        int score = (word == null || word.isEmpty()) ? 0 :
                word.chars().map(c -> LettersMap.getScore((char) c)).sum();

        return doubleWord ? score * 2 : tripleWord? score *3:score;
    }

}
