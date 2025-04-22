/*
* Você está iniciando suas atividades como pessoa desenvolvedora e foi designado para criar um programa de cadastro de
* livros que será escolhida através de um único caractere. O sistema armazenar em variáveis:

Título
Autor
Número de páginas
Preço de um livro
Categoria do livro As categorias disponíveis são:
F - Ficção
N - Não-ficção
T - Tecnologia
H - História
Escreva um programa que armazene em variáveis as informações de um livro e com base na categoria armazenada exiba
* uma mensagem de confirmação de acordo com o que foi escolhido.
*
* */

public class DesafioCinco {
    public String titulo;
    public String autor;
    public int numeroPaginas;
    public Double preco;
    public char categoria;

    public DesafioCinco(String titulo, String autor, int numeroPaginas, Double preco, char categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
        this.categoria = categoria;
    }

    public static void main(String[] args) {
        DesafioCinco livro = new DesafioCinco("O Senhor dos Anéis", "J.R.R. Tolkien", 1216, 59.90, 'F');
        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Número de Páginas: " + livro.numeroPaginas);
        System.out.println("Preço: R$" + livro.preco);
        System.out.println("Categoria: " + livro.categoria);
    }
}
