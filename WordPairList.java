import java.util.ArrayList;
public class WordPairList {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /**
     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {
        /* to be implemented in part (a) */
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length; i ++) {
            for (int j = i+1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
//                System.out.println("pass");
            }
        }
    }

    /**
     * Returns the number of matches as described in part (b).
     */
    public int numMatches() {
        /* to be implemented in part (b) */
        int count = 0;
        for (int i = 0; i < allPairs.size(); i ++) {
            String one = allPairs.get(i).getFirst();
            String two = allPairs.get(i).getSecond();
            if (one.equals(two)) {
                count ++;
//                System.out.println("match");
            }
            else {
//                System.out.println("not");
            }
        }
        return count;
    }

    public ArrayList<WordPair> getAllPairs () {
        return allPairs;
    }

}