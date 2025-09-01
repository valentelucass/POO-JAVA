public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) { // Comida -> Classe ao invés de tipo + um parametro comida. Forma de puxar uma classe
        if (comida != null) { // segurança contra null
            this.peso += comida.peso; // aumenta o peso da pessoa
            // this.peso = peso + comida.peso
            System.out.println(this.nome + " comeu " + comida.nome + " que agora passa a pesar " + peso + " kg");
        }
    }

    String infoPessoa() {
        return nome + " está pesando " + peso + " kg";
    }
}
