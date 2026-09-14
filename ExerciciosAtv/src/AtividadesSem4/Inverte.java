package AtividadesSem4;

public class Inverte {
    public static void main(String[] args){
        int[] numeros  = new int[] {10, 20, 30, 40, 50};

        for (int i = 0; i < 5; i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        for(int i = 4; i >= 0; i--){
            System.out.print(numeros[i]+" ");
        }
    }
}
