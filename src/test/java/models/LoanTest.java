package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

/**
 * Testfall för Loan-klassen.
 * Denna klass innehåller enhetstester för att verifiera funktionaliteten i Loan-klassen.
 */
public class LoanTest {

    /**
     * Testar att förfallodatumet för ett lån är korrekt satt.
     * Detta test verifierar att förfallodatumet är 14 dagar från dagens datum.
     */
    //VG
    @Test
    public void testDueDate() {
        Customer customer = new Customer("Mr", "Michael", "Smith", "1 The High Street","1234","a@b.com",1, GenderType.MALE);
        Book book1 = new Book(2,"The Java Book","","","",0);

        LocalDate expectedDueDate = LocalDate.now().plusDays(14);
        Loan loan = new Loan(1, customer, book1);
        assertEquals(expectedDueDate, loan.getDueDate());
    }
}