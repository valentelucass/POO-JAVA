package desafio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    double obterValorTotal() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }

    public Set<String> obterNomesItens() {
        Set<String> tipos = new HashSet<>();
        for (Compra compra : compras) {
            for (Item item : compra.itens) {
                tipos.add(item.nome);
            }
        }
        return tipos;
    }

    public String toString() {
        return nome;
    }
}
