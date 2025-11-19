package corrida_carro;

public class Carro extends Thread {
    private String nome;
    private double velocidade = 0;
    private double distanciaPercorrida = 0; 
    private double linhaDeChegada;
    private boolean terminou = false;

    public Carro(String nome, double linhaDeChegada) {
        this.nome = nome;
        this.linhaDeChegada = linhaDeChegada;
    }

    @Override
    public void run() {
        try {
            double dt = 0.1; // intervalo de tempo 
            while (!terminou) {

                double aceleracao = Math.random() * 10; // aceleracao variável

                // v = v0 + a*t
                velocidade = velocidade + aceleracao * dt;

                // s = s0 + v * t
                double deslocamento = velocidade * dt;
                distanciaPercorrida += deslocamento;

                System.out.printf("O %s andou %.0fm \t e já percorreu %.0fm%n",
                        nome, deslocamento, distanciaPercorrida);

                if (distanciaPercorrida >= linhaDeChegada) {
                    terminou = true;
                    System.out.println(nome + " alcançou a linha de chegada!");
                }

                Thread.sleep(100); // simular passagem do tempo
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

