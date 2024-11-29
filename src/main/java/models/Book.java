package models;

/**
 * Representerar en bok som är en typ av biblioteksmaterial.
 * Denna klass ärver från Material-klassen och lägger till bokspecifika egenskaper.
 */
public class Book extends Material {

    private String author;
    private String isbn;
    private int noOfPages;

    /**
     * Konstruerar en ny Book-instans.
     *
     * @param id        Unikt ID för boken
     * @param title     Bokens titel
     * @param author    Bokens författare
     * @param isbn      Bokens ISBN (International Standard Book Number)
     * @param branch    Filialen där boken finns
     * @param noOfpages Antal sidor i boken
     */
    public Book(int id, String title, String author, String isbn, String branch, int noOfpages)
    {
        super(id,title,branch);
        this.author = author;
        this.isbn = isbn;
        this.noOfPages= noOfpages;
    }

    /**
     * Hämtar bokens författare.
     *
     * @return Författarens namn
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Hämtar bokens ISBN.
     *
     * @return Bokens ISBN
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Skickar boken på reparation.
     * Skriver ut ett meddelande om att boken har skickats för reparation.
     */
    public void sendForRepair() {
        System.out.println("Book has been sent for repair");
    }

    /**
     * Hämtar låneperioden för boken.
     *
     * @return Antal dagar som boken kan lånas, vilket är 21 dagar
     */
    public int getLoanPeriod() {
        return 21;
    }

}
