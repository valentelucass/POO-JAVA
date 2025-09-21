public class Vilao extends Protagonista {
    public Vilao(String papel, String nome) {
        super(papel, nome);
    }

    @Override
    public void usaHabilidade(String habilidade) {
        System.out.println("Habilidade de Vilão" + habilidade);
    }
}
