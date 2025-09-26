public class CaoMiudo {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Arnold, o bravo", 16, 12, 8);
        Inimigo i = new Inimigo("Globin-miudo", 5, 10);
        EngineBatalha bc = new EngineBatalha();

        bc.lutar(g, i);
    }
}
