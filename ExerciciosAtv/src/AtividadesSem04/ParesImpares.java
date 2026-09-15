package AtividadesSem04;
import java.util.ArrayList;

public class ParesImpares {
    public static void main(String[] args){
        int[] numeros  = new int[] {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            System.out.print(numeros[i]+" ");

            if((numeros[i] % 2) == 0){
                pares.add(numeros[i]);
            }
            else{
                impar.add(numeros[i]);
            }
        }

        System.out.println();
        System.out.print("Impares: ");
        for(int i = 0; i < impar.size(); i++){
            System.out.print(impar.get(i) + " ");
        }
        System.out.println();
        System.out.print("Pares: ");
        for(int i = 0; i < pares.size(); i++){
            System.out.print(pares.get(i) + " ");
        }

    }
}
