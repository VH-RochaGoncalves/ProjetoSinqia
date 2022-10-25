public class MudarTemperatura {

    public static void main(String[] args) {
        double fahrenheit1;
        double fahrenheit2;
        final double fator1 = 9/5d;
        final double fator2 = 32;
        double celsius1 = 25;
        double celsius2 = 40;

        fahrenheit1 = (celsius1 * fator1) + fator2;
        fahrenheit2 = (celsius2 * fator1) + fator2;

        System.out.println(celsius1 + "º celsius em fahrenheit são " + fahrenheit1 + "º");
        System.out.println(celsius2 + "º celsius em fahrenheit são " + fahrenheit2 + "º");
    }
}
