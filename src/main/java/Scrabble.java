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
        // Overloading constructor to handle test cases with letter multipliers and word multipliers
        this.word = word;
        this.doubleLetter=doubleLetter;
        this.tripleLetter=tripleLetter;
        this.doubleWord=doubleWord;
        this.tripleWord=tripleWord;
    }
    public int score() {
        return (word == null || word.isEmpty()) ? 0 : calculateScore();
    }
    private int calculateScore() {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += calculateLetterScore(Character.toUpperCase(word.charAt(i)), i);
        }
        return score * (doubleWord ? 2 : tripleWord ? 3 : 1);
    }

    private int calculateLetterScore(char letter, int position) {
        int letterScore = LettersMap.getScore(letter);// Get the score for the letter from the LettersMap class
        letterScore *= (doubleLetter != null && position < doubleLetter.length && doubleLetter[position] != null ? 2 : 1) *
                (tripleLetter != null && position < tripleLetter.length && tripleLetter[position] != null ? 3 : 1);
        // Multiply the letter score by the corresponding letter multiplier (2 for double letter, 3 for triple letter)
        return letterScore;
    }
}