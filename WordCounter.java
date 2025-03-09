import java.util.Scanner;

class WordCounter{
    public static void main(String[] args) {
        String userSentence = getSentenceInput();
        int sentenceCount = countWords(userSentence);
        System.out.println("The sentence has " + sentenceCount +" words.");
    }
    public static String getSentenceInput() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        return userSentence;
    }
    public static int countWords(String sentence) {
        int sentenceCount = sentence.split("\\s").length;
        return sentenceCount;
    } 
}