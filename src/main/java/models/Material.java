package models;

/**
 * En abstrakt klass som representerar ett biblioteksmaterial.
 * Denna klass fungerar som en basklass för olika typer av biblioteksmaterial.
 */
public abstract class Material {

    private int id;
    private String title;
    private String branch;
    private Customer borrower;

    /**
     * Konstruerar ett nytt Material-objekt.
     *
     * @param id     Unikt ID för materialet
     * @param title  Materialets titel
     * @param branch Filialen där materialet finns
     */
    public Material(int id, String title, String branch) {
        this.id = id;
        this.title = title;
        this.branch = branch;
    }

    /**
     * Hämtar materialets titel.
     *
     * @return Materialets titel
     */
    public String getTitle() {
        return title;
    }

    /**
     * Hämtar materialets ID.
     *
     * @return Materialets ID
     */
    public int getID() {
        return id;
    }

    /**
     * Flyttar materialet till en ny filial.
     *
     * @param newBranch Den nya filialens namn
     */
    public void relocate(String newBranch) {
        this.branch = newBranch;
    }

    /**
     * Lånar ut materialet till en kund.
     *
     * @param customer Kunden som lånar materialet
     * @return true om utlåningen lyckades, false om materialet redan är utlånat
     */
    public boolean lend(Customer customer) {
        if (borrower == null) {
            borrower = customer;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Hämtar låneperioden för materialet.
     * Denna metod måste implementeras av subklasser.
     *
     * @return Antal dagar som materialet kan lånas
     */
    public abstract int getLoanPeriod();

    /**
     * Returnerar en strängrepresentation av materialet.
     *
     * @return Materialets titel
     */
    @Override
    public String toString() {
        return title;
    }

    /**
     * Jämför detta material med ett annat objekt för likhet.
     *
     * @param obj Objektet att jämföra med
     * @return true om objekten är lika, annars false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() == obj.getClass()) {
            Material otherClass = (Material)obj;
            return id == otherClass.id;
        }
        else {
            return false;
        }
    }
}