package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Testfall för Book-klassen.
 * Denna klass innehåller enhetstester för att verifiera funktionaliteten i Book-klassen.
 */
class BookTest {

    /**
     * Testar att två böcker med samma ID anses vara lika.
     */
    //G
    @Test
    public void test2EqualBooks() {
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        Book book2 = new Book(1, "Learning Java", "", "", "", 0);
        assertEquals(book1, book2);
    }

    /**
     * Testar att två böcker med olika ID anses vara olika.
     */
    //G
    @Test
    public void test2NonEqualBooks() {
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        Book book2 = new Book(2, "The Java Book", "", "", "", 0);
        assertNotEquals(book1, book2);
    }
}