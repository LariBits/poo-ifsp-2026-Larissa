package Aula03;

public class CoercaoVsCasting {
    public static void main (String[] args){
        long populacaoCidade = 1_500_000;

        int votosApurados = 1_499_999;
        long totoalGeral = votosApurados;

        float mediaNotas = 8;
        double notaFinal = mediaNotas;

        double saldoConta = 2500.75;
        long saldoEmCentavosAprox =  (long) (saldoConta * 100);

        int quantidadeItens = 10;
        float precoUnitario = 3.5f;
        float totCompras = quantidadeItens * precoUnitario;

        double mediaFinal = 7.8;
        int mediaAprovacao = (int) mediaFinal;

        System.out.println("Populacao cidade = " + populacaoCidade);
        System.out.println("Total geral = " + totoalGeral);
        System.out.println("Nota final = " + notaFinal);
        System.out.println("Saldo em cents aprox = " + saldoEmCentavosAprox);
        System.out.println("Total compra = " + totCompras);
        System.out.println("Media Aprovacao = " + mediaAprovacao);
    }
}
