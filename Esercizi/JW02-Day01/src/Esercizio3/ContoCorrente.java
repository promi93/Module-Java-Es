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


public class ContoOnLine extends ContoCorrente {
    double maxPrelievo;

    ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("il prelievo non è disponibile");
        }
        super.preleva(x);
    }
}


public class Banca {
    public static void main(String args[]) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(1750.5);

            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();

        try {
            conto2.preleva(2000);

            conto2.stampaSaldo();

        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }
    }
}


public class BancaException extends Exception {
    private String message;

    BancaException(String message) {
        super(message);
        this.message = message;
    }

    public String toString() {
        return message;
    }
}

