public class Desafio {
    // Cada objeto da classe tem uma variável chamada "a", que começa valendo 3.
    int a = 3; // variável de instância (pertence a cada objeto)

    // Variável "b" é estática (pertence à classe, e não ao objeto).
    static int b = 5;

    public static void main(String[] args) {
        // Criamos o objeto "a".
        // Nesse momento, a.a = 3.
        Desafio a = new Desafio();

        // Aqui mostramos o valor do campo "a" do objeto criado.
        System.out.println(a.a); // imprime 3

        // Aqui mostramos o valor do campo estático "b".
        // Como é estático, podemos acessar sem precisar do objeto (Direto por Desafio.b).
        System.out.println(b);   // imprime 5
    }
}

// Resumindo em português bem simples:
// - "a" é um valor que pertence a cada objeto. Cada vez que você cria um "Desafio", ele tem seu próprio "a".
// - "b" é da classe inteira, e é compartilhado entre todos os objetos.
