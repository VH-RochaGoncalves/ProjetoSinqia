import java.util.Scanner;

public class QuartaAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        if (args.length ==0){
            System.out.println("Digite dois valores:");
            int numero1 = entrada.nextInt();
            int numero2 = entrada.nextInt();
            int soma = 0;
            soma = numero1 + numero2;
            System.out.println("A soma dos números é " + soma);


        }else if (args.length == 1){
            System.out.println("Digite mais um valor: ");
            int numero2 = entrada.nextInt();
            int soma = 0;
            int valor = Integer.parseInt(args[0]);
            soma = valor + numero2;
            System.out.println("A soma dos números é " + soma);


        }else if(args.length == 2){
            int soma = 0;
            int valor = Integer.parseInt(args[0]);
            int valor1 = Integer.parseInt(args[1]);
            soma = valor + valor1;
            System.out.println("A soma dos números é " + soma);

        }else if (args.length >= 3){
            System.out.println("Quantidade de números inválida");
        }

    }
}
