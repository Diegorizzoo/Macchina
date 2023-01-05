package macchina;

public class Macchina {
    String colore;
    double velocita;
    String marca;
    boolean blocco = false;

    public Macchina(String colore, double velocita, String marca) {
        this.colore = colore;
        this.velocita = velocita;
        this.marca = marca;
    }

    double getvelocita() {
        return velocita;
    }

    void inserisciBlocco() {
        blocco = true;
    }

    void accelera(double n) {
        if (blocco == false) {
            velocita = velocita + n;
        }
    }
}
