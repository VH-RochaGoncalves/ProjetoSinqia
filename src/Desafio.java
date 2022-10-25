import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);


        int tamanho = getNumber(ent);
        int[][] tabuleiro = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                tabuleiro[i][j] = getNumber(ent);
            }

        }

        for (int[] linha : tabuleiro) {
            for (int elemento : linha) {
                System.out.println(elemento + " ");
            }
            System.out.println("\n");
        }
    }


    private static double  calculaMedia (int[] valores) {
           double soma = 0;
       }

    static int getNumber(Scanner input) {
        boolean result = false;
        int valor = 0;
        while(!result) {
            try {
                System.out.println("Digite o valor desejado. ");
                valor = input.nextInt();
                result = true;
            } catch (InputMismatchException e) {
//            e.printStackTrace();
                input.nextLine();
                System.out.println("O tipo digitado está incorreto, tente novamente.");
                return getNumber(input);

            }  catch (Exception e) {
                input.nextLine();
                System.out.println("Não foi possível obter o número.");

            }
        }
        return valor;



 //       for (int i = 0; i < valores.length; i++) {
 //           soma += valores[i];
 //

//        return soma / valores.length ;
    }


    }

