public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    // Construtor da classe Produto
    // Diferente de métodos comuns, não tem tipo de retorno (nem void)
    // É executado automaticamente ao criar um objeto (new Produto())
    Produto(String nome, double preco) {
        this.nome = nome;       // o atributo recebe o valor do parâmetro
        this.preco = preco;
        // this serve para diferenciar atributo do parâmetro com mesmo nome
    }

    // Construtor padrão
    Produto() {

    }

    // Método que calcula o preço com desconto extra do gerente
    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

    // Método que calcula o preço com desconto normal
    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
