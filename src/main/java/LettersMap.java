public class LettersMap {
    private static final int[] scores = {
            1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10
    };

    public static int getScore(char letter) {
        letter = Character.toUpperCase(letter);
        return (letter >= 'A' && letter <= 'Z') ? scores[letter - 'A'] : 0;
    }
}
