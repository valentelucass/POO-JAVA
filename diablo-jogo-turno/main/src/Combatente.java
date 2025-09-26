public interface Combatente {

    public abstract int rolarParaAcertar();
    public abstract int rolarDano();
    public abstract boolean getVivo();
    public abstract void receberDano(int dano);
    public abstract String getNome();
    public abstract int getAc();
}
