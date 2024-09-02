package ipod;

public class Ipod implements Reprodutor, Pausar, ProximaMusica {

    @Override
    public void reproduzir() {
        System.out.println("Repoduzindo musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica() {
       System.out.println("Proxima Musica");
    }
    


};
