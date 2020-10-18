package Task06_03;

public class TextRunner {
    public static void main(String[] args) {
        Word word = new Word("What is my name?");
        Text text = new Text(word);

        Word word1 = new Word("Name");
        Word word2 = new Word("is");
        Word word3 = new Word("Brawn");

        Phrase phrase = new Phrase();
        phrase.addValue(word1);
        phrase.addValue(word2);
        phrase.addValue(word3);

        text.addBody(phrase);

        System.out.println("Head: "+text.getHeader());
        System.out.println("Body: "+text.getBody());

    }
}