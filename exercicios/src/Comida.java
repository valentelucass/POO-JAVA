public class Comida {
    String nome;
    double peso;

    Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    String infoComida() {
        return nome + " com " + peso + " kg";
    }
}