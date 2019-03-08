/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 19/12/2018
Objetivo sucinto do programa: Testa livros com datas de devolucao, emprestimo, status do livro titulo e autor.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaLivro {

    public static void main(String[] args) {

        Date dataEmprestimo = new Date();
        Date dataDevolucao = new Date(dataEmprestimo.getTime() + (7 * 86400000));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataDevolucaoEstendida = new Date(dataDevolucao.getTime() + (2 * 86400000));
        Date dataEmprestimoModificada = new Date(dataEmprestimo.getTime() + (3 * 86400000));
        Date dataAdiantada = new Date(dataEmprestimo.getTime() - (7 * 86400000));

        Livro[] mangas = new Livro[4];

        mangas[0] = new Livro(1, "One Piece", "Echiro Oda", dataEmprestimo, dataDevolucao, "disponivel", 5);
        mangas[1] = new Livro(2, "Naruto", "Masashi Kishimoto", dataEmprestimo, dataDevolucao, "emprestado", 9);
        mangas[2] = new Livro(3, "JoJo", "Hirohiko Araki", dataEmprestimo, dataDevolucao, "emprestado", 40);
        mangas[3] = new Livro(4, "Fullmetal Alchemist", "Hiromu Arakawa", dataEmprestimo, dataDevolucao, "emprestado", 1);

        System.out.println("id do livro 2: " + mangas[1].getId());

        System.out.println("Titulo do livro 2: " + mangas[1].getTitulo());
        mangas[1].setTitulo("Boruto");
        System.out.println("novo capitulo do livro 2: " + mangas[1].getTitulo());

        System.out.println("Autor do livro 2: " + mangas[1].getAutor());
        mangas[1].setAutor("Jorge");
        System.out.println("novo autor do livro 2: " + mangas[1].getAutor());

        System.out.println("Data de devolucao: " + sdf.format(mangas[1].getDataDevolucao()));
        mangas[1].setDataDevolucao(dataDevolucaoEstendida);
        System.out.println("Data de devolucao estendida para: " + sdf.format(mangas[1].getDataDevolucao()));

        System.out.println("Data de emprestimo: " + sdf.format(mangas[1].getDataEmprestimo()));
        mangas[1].setDataEmprestimo(dataEmprestimoModificada);
        System.out.println("Data de emprestimo mudou: " + sdf.format(mangas[1].getDataEmprestimo()));

        System.out.println(Livro.exibirLivrosEmprestados(mangas));

        System.out.println(Livro.buscarLivro(mangas, "One Piece", "Echiro Oda"));
        System.out.println(Livro.buscarLivro(mangas, "Naruto", "Masashi Kishimoto"));

        System.out.println(mangas[0].getStatusLivro());
        System.out.println(mangas[0].emprestarLivro());
        System.out.println(mangas[0].getStatusLivro());
        System.out.println(mangas[1].devolverLivro());
        System.out.println(mangas[1].getStatusLivro());

        System.out.println(Livro.exibirLivrosDisponiveis(mangas));

        System.out.println(mangas[1].toString());
        System.out.println(mangas[2].toString());

        System.out.println(Livro.exibeLivroMaisEmprestado(mangas));
        System.out.println(Livro.exibirLivrosAtrasados(mangas));

        mangas[1].setDataDevolucao(dataAdiantada);
        System.out.println("Multa do livro 2: " + mangas[1].gerarMulta(2));
    }
}
