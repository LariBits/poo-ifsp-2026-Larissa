package AtividadeSem07.AtvII;

public class LeitorLinhaCSV {
    public static void main(String[] args) {
        String linha = "Maria,28,ATIVO";
        String outraLinha = "maria,28,ativo";

        // TODO 1: use split(",") para separar "linha" em um array de Strings (nome, idade, status)
        String[] dados = linha.split(",");

        // TODO 2: imprima cada posição do array separadamente
        System.out.println("Nome: " + dados[0]);
        System.out.println("Idade: " + dados[1]);
        System.out.println("Status: " + dados[2]);

        // TODO 3: compare linha.equals(outraLinha) e depois linha.equalsIgnoreCase(outraLinha), imprimindo os dois resultados
        System.out.println("equals: " + linha.equals(outraLinha));
        System.out.println("equalsIgnoreCase: " + linha.equalsIgnoreCase(outraLinha));

        // TODO 4: usando String.format, monte e imprima a frase: "Nome: Maria | Idade: 28 anos | Status: ATIVO" a partir das posições do array obtido no TODO 1
        String mensagem = String.format("Nome: %s | Idade: %s anos | Status: %s", dados[0], dados[1], dados[2]);
        System.out.println(mensagem);
    }
}
