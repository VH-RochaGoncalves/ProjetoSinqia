import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a operação matemática? Digite +, -, /, *");


        if(entrada.equals("+")){
            System.out.println("Digite dois valores:");
            int numero1 = entrada.nextInt();
            int numero2 = entrada.nextInt();
            int soma = 0;
            soma = numero1 + numero2;
            System.out.println("A soma dos números é " + soma);
        } else if(entrada.equals("-")) {
            System.out.println("Digite dois valores:");
            int numero1 = entrada.nextInt();
            int numero2 = entrada.nextInt();
            int sub = 0;
            sub = numero1 - numero2;
            System.out.println("A subtração dos números é " + sub);
        } else if(entrada.equals("/")) {
            System.out.println("Digite dois valores:");
            int numero1 = entrada.nextInt();
            int numero2 = entrada.nextInt();
            int div = 0;
            div = numero1 / numero2;
            System.out.println("A divisão dos números é " + div);
        } else if(entrada.equals("*")){
            System.out.println("Digite dois valores:");
            int numero1 = entrada.nextInt();
            int numero2 = entrada.nextInt();
            int multi = 0;
            multi = numero1 * numero2;
            System.out.println("A multiplicação dos números é " + multi);
        }
    }
}
