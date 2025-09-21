public abstract class Protagonista extends Personagem {
    private String nome;

    public Protagonista(String papel, String nome) {
        super(papel);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void usaHabilidade(String habilidade);
}
