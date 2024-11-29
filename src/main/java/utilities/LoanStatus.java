package utilities;

/**
 * Representerar möjliga statuslägen för ett lån i bibliotekssystemet.
 *
 * Denna enum används för att definiera och spåra lånets aktuella tillstånd
 * genom dess livscykel.
 */
public enum LoanStatus {
    /** Representerar ett aktivt, pågående lån som ännu inte är avslutat. */
    CURRENT,

    /** Representerar ett avslutat lån som inte längre är aktivt. */
    HISTORIC;
}
