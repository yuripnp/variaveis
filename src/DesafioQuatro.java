public class DesafioQuatro {
    /*
    * Você está desenvolvendo um sistema de monitoramento de temperatura para uma estufa de plantas.
    * Você recebe os dados de temperatura em graus Celsius, mas precisa exibi-los em Fahrenheit para
    * um relatório que será enviado para um cliente nos Estados Unidos.
    *
    * Crie um programa que receba uma temperatura em graus Celsius (int) e exiba a temperatura convertida
    * em graus Fahrenheit (double). A fórmula para conversão é:
    *
    * Fahrenheit = (Celsius * 9/5) + 32
    *
    * input: 25 celsius
    * output: 77.0 fahrenheit
    * */

    public static Double celsiusParaFahrenheit(int celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Double conversao = DesafioQuatro.celsiusParaFahrenheit(36);
        System.out.println(String.format("Temperatura em Fahrenheit: %.2f", conversao));
    }
}
