package desafio;

import java.util.Set;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Lucas");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Notebook", 1000, 1);
        compra1.adicionarItem("Mouse", 10, 1);
        compra1.adicionarItem("Teclado", 20, 1);

        c1.compras.add(compra1);

        System.out.println("Total gasto por " + c1.nome + ": R$ " + c1.obterValorTotal());
        System.out.println("Tipos diferentes de itens: " + c1.obterNomesItens());

        Set<String> nomes = c1.obterNomesItens();
        System.out.println("Nomes dos itens comprados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
