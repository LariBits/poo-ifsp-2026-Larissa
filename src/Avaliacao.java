import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o total de registros (N): ");
        int TotRegiao = scanner.nextInt(); 

        System.out.print("Digite o valor dos saltos (M): ");
        int saltos = scanner.nextInt(); 

        int[] array1 = new int[TotRegiao];
        for (int i = 0; i < TotRegiao; i++) {
            array1[i] = i + 1; 
        }
        
        int[] array2 = new int[TotRegiao];

        int posicaoArray2 = 0; 

        for (int i = 0; i < TotRegiao; i+= saltos) {
           
            if (array1[i] == 13) {
                continue; 
            }

            array2[posicaoArray2] = array1[i];
            posicaoArray2++;
        }

        System.out.println("\n--- Array 1 ---");
        for (int i = 0; i < TotRegiao; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n\n--- Array 2 ---");
        for (int i = 0; i < posicaoArray2; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
