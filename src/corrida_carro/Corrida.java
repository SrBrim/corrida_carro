package corrida_carro;

public class Corrida {

    public static void main(String[] args) {
        double linhaDeChegada = 50; // metros

        Carro c1 = new Carro("Carro_01", linhaDeChegada);
        Carro c2 = new Carro("Carro_02", linhaDeChegada);
        Carro c3 = new Carro("Carro_03", linhaDeChegada);
        Carro c4 = new Carro("Carro_04", linhaDeChegada);
        Carro c5 = new Carro("Carro_05", linhaDeChegada);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
