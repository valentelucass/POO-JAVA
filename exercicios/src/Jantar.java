public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Leticia", 85.0);
        Comida c1 = new Comida("Sanduiche", 0.500);
        System.out.println(p1.infoPessoa());
        System.out.println(c1.infoComida());
        p1.comer(c1);

        System.out.println();

        var p2 = new Pessoa("João", 100.0);
        var c2 = new Comida("Pizza", 0.800);
        System.out.println(p2.infoPessoa());
        System.out.println(c2.infoComida());
        p2.comer(c2);
    }
}