import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagram {

    String anagram;

    public Anagram(String anagram){
        this.anagram = anagram;
    }
    public List <String> match(List<String> wordList){

        List <String> anagrams = new ArrayList<String>();
        String anagramLow = this.anagram.toLowerCase();
        char[] anagramLetter = anagramLow.toCharArray();
        Arrays.sort(anagramLetter);
        for (String word : wordList){
            String wordLow = word.toLowerCase();
            char[] wordLetter = word.toCharArray();
            Arrays.sort(wordLetter);

            boolean letterSame = Arrays.equals(anagramLetter,wordLetter);
            boolean wordSame = anagramLow.equals(wordLow);

            if(letterSame && !wordSame){
                anagrams.add(word);
            }
        }
        return anagrams;
    }
}
