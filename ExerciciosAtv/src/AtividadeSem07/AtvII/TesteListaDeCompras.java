package AtividadeSem07.AtvII;

public class TesteListaDeCompras {
    public static void main(String[] args) {
        // 1. Cria a instância da ListaDeCompras
        ListaDeCompras lista = new ListaDeCompras();

        // 2. Adiciona pelo menos 3 objetos Produto diferentes
        lista.adicionar(new Produto("Arroz", 25.50));
        lista.adicionar(new Produto("Feijão", 8.90));
        lista.adicionar(new Produto("Leite", 5.40));

        // 3. Chama imprimirTodos() para exibir os itens
        System.out.println("=== ITENS NA LISTA DE COMPRAS ===");
        lista.imprimirTodos();

        // 4. Chama calcularTotal() e exibe o valor final
        double totalGeral = lista.calcularTotal();
        System.out.println("---------------------------------");
        System.out.println("Valor Total: R$ " + totalGeral);
    }
}
