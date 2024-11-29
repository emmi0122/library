package models;

/**
 * Ett undantag som kastas när en efterfrågad bok inte kan hittas i katalogen.
 * Detta är ett kontrollerat undantag som ärver från Exception.
 */
public class BookNotFoundException extends Exception {

    /**
     * En unik identifierare för serialisering av klassen.
     */
    private static final long serialVersionUID = 1L;

}
