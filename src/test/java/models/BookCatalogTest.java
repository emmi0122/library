package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testfall för BookCatalog-klassen.
 * Denna klass innehåller enhetstester för att verifiera funktionaliteten i BookCatalog.
 */
public class BookCatalogTest {
    private BookCatalog bc;
    private Book book1;

    /**
     * Konstruktor för BookCatalogTest.
     * Initialiserar en BookCatalog och lägger till en bok för testning.
     */
    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1,"Learning Java","","","",0);
        bc.addBook(book1);
    }

    /**
     * Testar att lägga till en bok i katalogen.
     */
    //G
    @Test
    public void testAddABook() {
        Book book1 = new Book(2,"The Java Book","","","",0);
        bc.addBook(book1);
        assertEquals(2, bc.getNumberOfBooks());
        assertEquals("The Java Book", bc.getBookArray()[1].getTitle());
    }

    /**
     * Testar att hitta en bok i katalogen.
     * @throws BookNotFoundException om boken inte hittas
     */
    //G
    @Test
    public void testFindBook() throws BookNotFoundException {
        BookCatalog bc = new BookCatalog();
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
        assertEquals(1, bc.getNumberOfBooks());
        assertEquals("Learning Java", bc.getBookArray()[0].getTitle());
        assertEquals("Learning Java", bc.findBook("Learning Java").getTitle());
    }

    /**
     * Testar att hitta en bok oavsett skiftläge på titeln.
     * @throws BookNotFoundException om boken inte hittas
     */
    //G
    @Test
    public void testFindBookIgnoringCase() throws BookNotFoundException {
        Book book1 = bc.findBook("LEARNING JAVA");
        assertNotNull(book1);
        assertEquals("Learning Java", book1.getTitle());

        Book book2 = bc.findBook("learning java");
        assertNotNull(book2);
        assertEquals("Learning Java", book2.getTitle());

        Book book3 = bc.findBook("LeArNiNg JaVa");
        assertNotNull(book3);
        assertEquals("Learning Java", book3.getTitle());

        Book book4 = bc.findBook("lEaRnInG jAvA");
        assertNotNull(book4);
        assertEquals("Learning Java", book4.getTitle());

        Book book5 = bc.findBook("LEARNING java");
        assertNotNull(book5);
        assertEquals("Learning Java", book5.getTitle());

        Book book6 = bc.findBook("learning JAVA");
        assertNotNull(book6);
        assertEquals("Learning Java", book6.getTitle());
    }

    /**
     * Testar att hitta en bok med extra mellanslag i titeln.
     * @throws BookNotFoundException om boken inte hittas
     */
    //G
    @Test
    public void testFindBookWithExtraSpaces() throws BookNotFoundException {
        Book book1 = bc.findBook(" Learning Java ");
        assertNotNull(book1);
        assertEquals("Learning Java", book1.getTitle());
    }

    /**
     * Testar att ett undantag kastas när en icke-existerande bok söks.
     * @throws BookNotFoundException förväntas kastas när boken inte hittas
     */
    //VG
    // This test should throw BookNotFoundException in order to pass.
    @Test
    public void testFindBookThatDoesntExist() throws BookNotFoundException {
        BookCatalog bc = new BookCatalog();
        assertThrows(BookNotFoundException.class, () -> {
            bc.findBook("Nonexistent Book");
        });
    }
}