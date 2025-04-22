/*
*Você está desenvolvendo um programa que precisa verificar se uma pessoa é maior de idade ou não.
* O programa deve exibir uma mensagem informando se a pessoa pode ou não acessar um determinado
* conteúdo restrito. No entanto, você cometeu um erro ao implementar a lógica de verificação e
* precisa corrigir isso.
*
* Identificar e corrigir o erro de escopo de variáveis no código.
* Garantir que o programa exiba a mensagem correta com base na idade da pessoa, no código abaixo
* a saída será Você é menor de idade.
*
*
* public class Main {
    public static void main(String[] args) {
        if (idade >= 18) {
            int idade = 17;
            String mensagem = "Você é maior de idade.";
        } else {
            String mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);
    }
}
* */

public class DesafioNove {
    public static void main(String[] args) {
        String mensagem;
        int idade = 18;
        if (idade >= 18) {
            idade = 17;
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);

    }

}
