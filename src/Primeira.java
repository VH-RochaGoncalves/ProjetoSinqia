import java.util.Scanner;

public class Primeira {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um número par");
        int numero = getNumber(ent);
        while (numero % 2 == 1) {
            System.out.println("Digite novamente");
            numero = getNumber(ent);
        }
        System.out.println("O numero foi: " + numero);
        // int soma = 0;
        //  int i = 0:
        //   while(i < 5) {
        //     soma += getNumber(ent);
        //     i++;
//    }

//        int soma = 0;
//        for(int j = 0; j < 5; j++) {
 //           soma += getNumber(ent);
  //      }

    }


    static int getNumber(Scanner input) {
        int variavel;
        System.out.println("Digite o valor desejado.");
        return input.nextInt();
    }

}
