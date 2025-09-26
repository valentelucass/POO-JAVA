import java.util.Random;

public class Inimigo implements Combatente {
    private String nome;
    private int hp;
    private int ac;
    private Random random = new Random();

    //construtor
    public Inimigo(String nome, int hp, int ac) {
        this.nome = nome;
        this.hp = hp;
        this.ac = ac;
    }

    @Override
    public int rolarParaAcertar() {
        return random.nextInt(20) + 1;
    }

    @Override
    public int rolarDano() {
        return random.nextInt(6) + 1;
    }

    @Override
    public boolean getVivo() {
        return hp > 0;
    }

    @Override
    public void receberDano(int dano) {
        hp -= dano;
        if (hp < 0) hp = 0;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getAc() {
        return ac;
    }
}
