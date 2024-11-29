package models;

/**
 * Representerar en katalog över böcker.
 * Denna klass hanterar en samling av Book-objekt och tillhandahåller metoder för att lägga till och söka efter böcker.
 */
public class BookCatalog {

    private Book[] bookArray = new Book[100];
    private int nextPosition = 0;

    /**
     * Hämtar arrayen som innehåller alla böcker i katalogen.
     *
     * @return En array av Book-objekt
     */
    public Book[] getBookArray() {
        return bookArray;
    }

    /**
     * Hämtar antalet böcker som för närvarande finns i katalogen.
     *
     * @return Antalet böcker i katalogen
     */
    public int getNumberOfBooks() {
        return nextPosition;
    }

    /**
     * Lägger till en ny bok i katalogen.
     *
     * @param newBook Boken som ska läggas till
     */
    public void addBook(Book newBook) {
        bookArray[nextPosition] = newBook;
        nextPosition++;
    }

    /**
     * Söker efter en bok i katalogen baserat på dess titel.
     *
     * @param title Titeln på boken som söks
     * @return Book-objektet som matchar den givna titeln
     * @throws BookNotFoundException Om ingen bok med den givna titeln hittas
     */
    public Book findBook(String title) throws BookNotFoundException
    {
        title = title.trim();

        for (int counter = 0; counter < nextPosition; counter++) {
            if (bookArray[counter].getTitle().equalsIgnoreCase(title)) {
                return bookArray[counter];
            }
        }
        throw new BookNotFoundException();
    }

}
