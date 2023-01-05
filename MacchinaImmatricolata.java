package macchina;

public class MacchinaImmatricolata extends Macchina {
    double maxVelocita;
    String targa;

    public MacchinaImmatricolata(String colore, double velocita, String marca, double maxVelocita, String targa) {
        super(colore, velocita, marca);
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }

    double getMax() {
        return maxVelocita;
    }

    @Override
    void accelera(double n) {
        double s = n + velocita;
        if (s < maxVelocita) {
            velocita = s;
        } else {
            velocita = maxVelocita;
        }
    }

}
