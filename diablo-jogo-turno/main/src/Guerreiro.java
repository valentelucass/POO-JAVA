public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int forca, int destreza, int inteligencia) {
        super(forca, nome, destreza, inteligencia);
    }

    @Override
    public int rolarParaAcertar() {
        return random.nextInt(20) + 1 + getModificadorAtributo(getDestreza());
    }

    @Override
    public int rolarDano() {
        return random.nextInt(8) + 1 + getModificadorAtributo(getForca());
    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(dano);
    }
}
