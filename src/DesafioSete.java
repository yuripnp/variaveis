/*
* Você está desenvolvendo um jogo e quer um programa que determine se um número é par ou ímpar.
*
* Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.
*
* Exemplo de entrada:
* input:
* numero = 7
*
* output:
* Número ímpar
*
* */


import java.util.Scanner;

public class DesafioSete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
        scanner.close();
    }
}
