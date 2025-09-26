import java.util.Random;

public abstract class Personagem implements Combatente {
    private String nome;
    private int forca;
    private int destreza;
    private int inteligencia;
    private int nivel;
    private int gold;
    private int maxHp;
    private int hp;
    private int maxMp;
    private int mp;
    private int ac;
    protected Random random = new Random();

    public Personagem(int forca, String nome, int destreza, int inteligencia) {
        this.forca = forca;
        this.nome = nome;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.nivel = 1;
        this.gold = 0;
        calcularAtributosDerivados();
    }

    public void calcularAtributosDerivados() {
        this.maxHp = 10 + getModificadorAtributo(forca) + (nivel - 1) * getModificadorAtributo(forca);
        this.hp = maxHp;
        this.maxMp = 10 + getModificadorAtributo(inteligencia) + (nivel - 1) * getModificadorAtributo(inteligencia);
        this.mp = maxMp;
        this.ac = 10 + getModificadorAtributo(destreza);
    }

    public int getModificadorAtributo(int atributo) {
        return (atributo - 10) / 2;
    }

    public int getAc() {
        return ac;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public boolean getVivo() {
        return hp > 0;
    }

    @Override
    public int rolarParaAcertar() {
        return random.nextInt(20) + 1 + getModificadorAtributo(destreza);
    }

    @Override
    public int rolarDano() {
        return random.nextInt(8) + 1 + getModificadorAtributo(forca);
    }

    @Override
    public void receberDano(int dano) {
        hp -= dano;
        if (hp < 0) hp = 0;
    }

    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getNivel() {
        return nivel;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getMp() {
        return mp;
    }

    public int getMaxMp() {
        return maxMp;
    }
}
