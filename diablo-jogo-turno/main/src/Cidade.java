public class Cidade implements Cenario{
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void explorar() {
        System.out.println("Explorando " + nome);
    }

    public void entrarMasmorra() {
        System.out.println("Entrando em uma masmorra de " + nome);
    }
}
