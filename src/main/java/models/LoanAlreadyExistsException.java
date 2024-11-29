package models;

/**
 * Ett undantag som kastas när ett försök görs att skapa ett lån som redan existerar.
 * Detta är ett kontrollerat undantag som ärver från Exception.
 */
public class LoanAlreadyExistsException extends Exception {

}
