public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Lucas";
        c1.adicionarItem("Notebook", 1000, 1);
        c1.adicionarItem("Mouse", 10, 1);
        c1.adicionarItem("Teclado", 20, 1);

        System.out.println("Quantidade de itens: " + c1.itens.size());
        System.out.println("Cliente: " + c1.cliente);
        System.out.println("Valor total: " + c1.obterValorTotal());
        System.out.println();
        for (Item item : c1.itens) {
            System.out.println(item.nome + " - " + item.preco + " - " + item.quantidade);
        }
    }
}
