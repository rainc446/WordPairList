public class WordPair {
    /** Constructs a WordPair object. */
    private String first;
    private String second;
    public WordPair(String first, String second) {
        /* implementation not shown */
        this.first = first;
        this.second = second;
    }

    /** Returns the first string of this WordPair object. */
    public String getFirst() {
        /* implementation not shown */
        return first;
    }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        /* implementation not shown */
        return second;
    }
    public String toString ()
    {
        return "{" + first + "," + second + "}";
    }
}