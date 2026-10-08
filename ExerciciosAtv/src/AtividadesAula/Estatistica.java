package AtividadesAula;

public class Estatistica {

    public static double Media (double [] Valores){

        double soma = 0.0;

        for(int i = 0; i < Valores.length; i++){
            soma+=Valores[i];
        }
        return soma / Valores.length;
    }

    public static double Variancia (double [] Valores){

        double m = Media(Valores);
        double soma = 0.0;

        for(int i = 0; i < Valores.length; i++){
            soma += Math.pow(Valores[i] - m, 2.0);
        }
        return soma / (Valores.length - 1);
    }

    public static double DesvioPadrao (double [] Valores){

        return Math.sqrt(Variancia(Valores));
    }


    public static void main(String[] args) {

    double[] dados = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 33, 33, 55, 78};

    System.out.println("Media: " + Media(dados));
    System.out.println("Variancia: " + Variancia(dados));
    System.out.println("Desvio Padrão: " + DesvioPadrao(dados));
    }
}
