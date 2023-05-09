package Esercizio3;


public class BancaException extends Exception {
    private String message;

    BancaException(String message) {
        super(message);
        this.message = message;
    }

    
    @Override
    public String toString() {
        return this.message;
    }
}
