package macchina;

public class UsoMacchina {
    public static void main(String[] args) throws Exception {
        Macchina a = new Macchina("grigiometallizzato", 60.5, "Fiat 500");
        double v = a.getvelocita();
        MacchinaImmatricolata b = new MacchinaImmatricolata("rosso", 50.5, "fiatpanda", 70, "CV123FR");
        System.out.println("velocità massima fiat panda: " + b.getMax());
        a.accelera(30.7);
        b.accelera(30.7);
        System.out.println("velocità fiat 500: " + a.getvelocita());
        System.out.println("velocità fiat panda: " + b.getvelocita());
    }

}
