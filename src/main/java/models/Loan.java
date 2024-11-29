package models;


//import java.util.Date;
//import java.util.GregorianCalendar;

import java.time.LocalDate;
import utilities.LoanStatus;

/**
 * Representerar ett lån av en bok till en kund i bibliotekssystemet.
 */
public class Loan {

    private int ID;
    private Customer customer;
    private Book book;
    //private Date startDate;
    private LocalDate dueDate;
    //private Date returnDate;
    private LoanStatus status;

    /**
     * Konstruerar ett nytt Loan-objekt.
     *
     * @param iD       Unikt ID för lånet
     * @param customer Kunden som lånar boken
     * @param book     Boken som lånas ut
     */
    public Loan(int iD, Customer customer, Book book) {
        super();
        ID = iD;
        this.customer = customer;
        this.book = book;
        dueDate = LocalDate.now().plusDays(14);
        status = LoanStatus.CURRENT;
    }

    /**
     * Returnerar en strängrepresentation av lånet.
     *
     * @return En sträng som beskriver lånet
     */
    @Override
    public String toString() {
        return "Loan [ID=" + ID + ", customer=" + customer.getMailingName() + ", book=" + book.getTitle()
                + "]";
    }

    /**
     * Genererar en hashkod för lånet.
     *
     * @return En hashkod baserad på lånets ID
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        return result;
    }

    /**
     * Jämför detta lån med ett annat objekt för likhet.
     *
     * @param obj Objektet att jämföra med
     * @return true om objekten är lika, annars false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Loan other = (Loan) obj;
        if (ID != other.ID)
            return false;
        return true;
    }

    /**
     * Hämtar kunden som lånade boken.
     *
     * @return Kunden som lånade boken
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Hämtar boken som lånades ut.
     *
     * @return Boken som lånades ut
     */
    public Book getBook() {
        return book;
    }

    /**
     * Hämtar återlämningsdatumet för lånet.
     *
     * @return Återlämningsdatumet
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Hämtar lånets nuvarande status.
     *
     * @return Lånets status
     */
    public LoanStatus getStatus() {
        return status;
    }

    /**
     * Avslutar lånet och markerar det som historiskt.
     */
    public void endLoan() {
        //returnDate = new Date();
        status = LoanStatus.HISTORIC;
    }

}
