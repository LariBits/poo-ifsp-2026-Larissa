package AtividadeSem07.AtvII;

public class ValidadorCadastro {
    public static void main(String[] args) {
        String nomeDigitado = " maria ";

        // TODO 1: remova os espaços do início/fim de nomeDigitado (método trim)
        String nomeTratado = nomeDigitado.trim();

        // TODO 2: verifique se o resultado, após o trim, está vazio (método isEmpty)
        // e imprima "Nome inválido!" se estiver
        if (nomeTratado.isEmpty()) {
            System.out.println("Nome inválido!");
        } else {
            // TODO 3: se não estiver vazio, imprima o nome em maiúsculas (toUpperCase)
            System.out.println(nomeTratado.toUpperCase());

            // TODO 4: imprima também quantos caracteres o nome tem, sem contar os espaços (length)
            System.out.println(nomeTratado.length());
        }
    }
}