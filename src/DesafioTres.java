public class DesafioTres {
    /*
    * Você está desenvolvendo um aplicativo que calcula a média de notas dos alunos. Para isso, você precisa armazenar
    * as notas em variáveis do tipo double. Você decide criar três variáveis chamadas nota1, nota2 e nota3, e atribuir
    * a elas os valores 7.5, 8.0 e 9.0, respectivamente e em seguida, calcular a média e exibi-la na tela.
    *
    * Para resolver essa tarefa, você deve criar um programa que:
    * Declare as variáveis nota1, nota2 e nota3
    * Atribua os valores mencionados.
    * Calcule a média das notas.
    * output a média na tela.
    * */
    public static Double media(Double nota1, Double nota2, Double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
    public static void main(String[] args) {
        Double media = DesafioTres.media(7.5, 8.0, 9.0);
        System.out.println(String.format("Média: %.2f", media));
    }
}
