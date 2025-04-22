/*
*Você trabalha em um e-commerce e precisa classificar os produtos em diferentes categorias com base no preço.
* Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria
* correspondente, conforme as seguintes regras:
*
* Econômico: preço até R$ 50,00.
* Intermediário: preço entre R$ 50,01 e R$ 200,00.
* Premium: preço acima de R$ 200,00. Exemplo de entrada:
*
* input:
* valor = 150.00
*
* output:
* Produto Intermediário
*
* */


import java.util.Scanner;

public class DesafioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        if (valor <= 50.00) {
            System.out.println("Produto Econômico");
        } else if (valor > 50.00 && valor <= 200.00) {
            System.out.println("Produto Intermediário");
        } else {
            System.out.println("Produto Premium");
        }
        scanner.close();
    }
}
