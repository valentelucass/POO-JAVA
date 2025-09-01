public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2440.98);
        //p1.nome = "Notebook";
        //p1.preco = 2440.98;
        //p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Carro";
        p2.preco = 34455.90;
        Produto.desconto = 0.91; // produto puxando da classe, se alterar aqui altera total como se fosse na classe atributo

        var p3 = new Produto("Computador", 1000);

        // preço final do p1. Colocou 1 pois 1 - 0.25 = 0.75 que é o que restou após desconto.
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(5);
        double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
        System.out.printf("Preço final de "+p1.nome+": R$ %.2f%n", precoFinal1);
        System.out.printf("Preço final de "+p2.nome+": R$ %.2f%n", precoFinal2);
        System.out.printf("Total da compra: R$ %.2f%n", mediaCarrinho);
        System.out.println(p3.precoComDesconto());

    }
}