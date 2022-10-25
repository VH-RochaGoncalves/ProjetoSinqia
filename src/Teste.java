import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     if (args.length == 0) {
         System.out.println("Por favor, digite dois números");
         int valor1 = entrada.nextInt();
         int valor2 = entrada.nextInt();
         int soma = 0;
         soma = valor1 + valor2;
         System.out.println("A soma dos numéros é " + soma);
     }else if (args.length == 1){
         System.out.println("Por favor, digite um número");
         int valor1 = entrada.nextInt();
         int valor2 = Integer.parseInt(args[0]);
         int soma = 0;
         soma = valor2 + valor1;
         System.out.println("A soma dos números é " + soma);
     }else if (args.length == 2){
         int valor1 = Integer.parseInt(args[0]);
         int valor2 = Integer.parseInt(args[1]);
         int soma = 0;
         soma = valor1 + valor2;
         System.out.println("A soma dos números é " + soma);
     }else if (args.length >= 3) {
            System.out.println("A quantidade de números é inválida!");
     }
    }
}



