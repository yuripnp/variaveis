/*
* Você está organizando uma viagem internacional e precisa converter uma quantia em reais (R$)
* para dólares americanos (US$) com base na taxa de câmbio atual. A taxa utilizada no momento
* é de R$ 5,25 para cada US$ 1.
*
* Crie um programa que realize a conversão para dólares usando a taxa de câmbio e exiba o valor convertido.
*
* Exemplo de entrada:
* input:
* valorEmReais = 1000.00
*
* output:
* Valor em dólares: US$ 190.48
* */

import java.util.Scanner;

public class DesafioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em reais (R$): ");
        double valorEmReais = scanner.nextDouble();
        double taxaDeCambio = 5.25; // Taxa de câmbio atual
        double valorEmDolares = valorEmReais / taxaDeCambio;
        System.out.printf("Valor em dólares: US$ %.2f%n", valorEmDolares);
    }
}
