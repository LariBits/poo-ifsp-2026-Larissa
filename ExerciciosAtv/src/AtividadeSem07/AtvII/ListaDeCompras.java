package AtividadeSem07.AtvII;
import java.util.ArrayList;

public class ListaDeCompras {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto) {
        // TODO: adicione produto na lista "produtos"
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        // TODO: percorra "produtos" com um for-each somando o preço de cada um
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public void imprimirTodos() {
        // TODO: percorra "produtos" imprimindo nome e preço de cada Produto
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome() + " | Preço: R$ " + p.getPreco());
        }
    }
}
