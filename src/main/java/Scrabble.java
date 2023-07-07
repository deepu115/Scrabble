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
      //overloading constructor according to test cases
        this.word = word;
        this.doubleLetter=doubleLetter;
        this.tripleLetter=tripleLetter;
        this.doubleWord=doubleWord;
        this.tripleWord=tripleWord;
    }
    public int score() {
        int score = 0;

        if (word != null && !word.isEmpty()) {
            for (int i = 0; i < word.length(); i++) {
                char letter = Character.toUpperCase(word.charAt(i));
                int letterScore = LettersMap.getScore(letter);
                // Check if the current position is a double letter
                return  (doubleLetter != null && i < doubleLetter.length && doubleLetter[i] != null) ? (letterScore*2):score;

            }
        }

        return doubleWord ? score * 2 : tripleWord ? score * 3 : score;
    }


}