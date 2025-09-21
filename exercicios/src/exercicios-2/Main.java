public class Main {
    public static void main(String[] args) {

        Heroi h = new Heroi("Salvar o mundo", "Jack");
        Vilao v = new Vilao("Acabar com o mundo", "Thanos");
        Npc npc = new Npc("Morrer no início");


        System.out.println(h.getNome());
        System.out.println(h.getPapel());
        h.usaHabilidade("Ser rico");

        System.out.println(v.getNome());
        System.out.println(v.getPapel());
        System.out.println("Ser pobre");

        System.out.println(npc.getPapel());

    }
}
