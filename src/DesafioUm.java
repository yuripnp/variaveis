public class DesafioUm {
    /*
    Você está começando seus primeiros passos na programação em Java e deseja reforçar
    seu aprendizado sobre declaração de variáveis.

    Escreva um programa que declare variáveis para o seu nome, idade, altura e se você é
    estudante, utilizando os tipos apropriados, e depois exiba os valores armazenados.

    input:
    nome: String
    idade: int
    altura: double

    output:
    "Sou o {nome}, tenho {idade} anos e {altura} metros."
     */

    public static void main(String[] args) {
        String nome = "Lucas";
        int idade = 20;
        double altura = 1.75;
        boolean estudante = true;

        System.out.println("Sou o " + nome + ", tenho " + idade + " anos e " + altura + " metros.");
    }
}
