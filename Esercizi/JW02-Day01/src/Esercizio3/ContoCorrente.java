package Esercizio3;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) throws BancaException {
        if (saldo - x < 0) {
            throw new BancaException("il conto è in rosso");
        }
        if (nMovimenti < maxMovimenti) {
            saldo -= x;
        } else {
            saldo -= x + 0.50;
        }
        nMovimenti++;
    }

    double restituisciSaldo() {
        return saldo;
    }
}







