public class Heroi extends Protagonista {
    public Heroi(String papel, String nome) {
        super(papel, nome);
    }

    @Override
    public void usaHabilidade(String habilidade) {
        System.out.println("Habilidade de Heroi" + habilidade);
    }
}
