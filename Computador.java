package senac2022;

public class Computador {
    String processador;
    String memoria;
    String monitor;
    String placaMae;

    public void desligarComputador() {
        System.out.println("Computador desligando");
    }

    public void ligarComputador(Computador computador) {
        System.out.println("Ligando computador " + computador.processador +
                computador.memoria +
                computador.placaMae +
                computador.monitor);
    }

    public void reiniciarComputador() {
        System.out.println("Reiniciando computador");
    }
}

