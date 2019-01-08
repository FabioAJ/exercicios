/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 19/12/2018
Objetivo sucinto do programa: Cria livros que pode ser modificada com metodos sets e get.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Livro{

    private int id;
    private String titulo;
    private String autor;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String statusLivro;
    private int quantidadeEmprestimos;

    //usado para datas
    //Date dataAtual = new Date();
    //Date dataAmanha = new Date(dataAtual.getTime() + 86400000); //data de 1 dia
    //Date dataProxSemana = new Date(dataAtual.getTime() + (7 * 86400000)); //data de 1 semana
    //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); //transforma em dia/mes/ano
    //System.out.println("dataAtual : " + sdf.format(dataAtual));

    public Livro() {

    }

    public Livro(int id, String titulo, String autor, Date dataEmprestimo, Date dataDevolucao, String statusLivro, int quantidadeEmprestimos) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.statusLivro = statusLivro;
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatusLivro() {
        return this.statusLivro;
    }

    public void setStatusLivro(String statusLivro) {
        this.statusLivro = statusLivro;
    }

    public int getQuantidadeEmprestimos() {
        return this.quantidadeEmprestimos;
    }

    public void setQuantidadeEmprestimos(int quantidadeEmprestimos) {
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }

    public String emprestarLivro() {
        Date dataAtual = new Date();
        Date dataProxSemana = new Date(dataAtual.getTime() + (7 * 86400000));
        if (this.statusLivro == "disponivel") {
            this.statusLivro = "emprestado";
            this.quantidadeEmprestimos += 1;
            setDataDevolucao(dataProxSemana);
            return "O livro " + this.getTitulo()  + " foi emprestado com sucesso!";
        } else {
            return "O livro " + this.getTitulo() + " ja esta emprestado.";
        }
    }

    public String devolverLivro() {
        if (this.statusLivro == "emprestado") {
            this.statusLivro = "disponivel";
            return "O livro "+ this.getTitulo()  + " foi devolvido com sucesso!";
        } else {
            return "O livro " + this.getTitulo()  + " está disponivel !";
        }
    }

    static String buscarLivro(Livro[] arr, String titulo, String autor) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  //transforma em dia/mes/ano
        if (arr.length == 0 || arr == null) {
            return "nao ha livros";
        } else {
            String lista = "--------------------";
            lista += "\nLivro encontrado com sucesso!";
            for(int i = 0;i < arr.length; i++){
                if (arr[i].getTitulo() == titulo && arr[i].getAutor() == autor) {
                    lista +=
                    "\nid: " + arr[i].getId() +
                    "\ntitulo: " + arr[i].getTitulo() +
                    "\nautor: " + arr[i].getAutor() +
                    "\ndata de emprestimo: " + sdf.format(arr[i].getDataEmprestimo()) +
                    "\ndata de devolucao: " + sdf.format(arr[i].getDataDevolucao()) +
                    "\nstatus do livro: " + arr[i].getStatusLivro() +
                    "\nquantidade de emprestimos: " + arr[i].getQuantidadeEmprestimos() +
                    "\n--------------------";
                }
            }
            return lista;
        }
    }

    static String exibirLivrosEmprestados(Livro[] arr) {
        if (arr.length == 0 || arr == null) {
            return "nao ha livros";
        } else {
            String lista = "Livros emprestados";
            lista += "\n--------------------";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].statusLivro == "emprestado") {
                    lista +=
                    "\ntitulo: " + arr[i].getTitulo() +
                    "\nautor: " + arr[i].getAutor() +
                    "\n--------------------";
                }
            }
            return lista;
        }
    }

    public static String exibirLivrosDisponiveis(Livro[] arr) {
        String disponiveis = "---------------------";
        disponiveis += "\nLivros disponiveis";
        for(int i = 0;i < arr.length; i++){
            if(arr[i].getStatusLivro() == "disponivel") {
                disponiveis += "\nTitulo: " + arr[i].getTitulo() + " Autor: " + arr[i].getAutor();
                disponiveis += "\n---------------------";
            }
        }
        return disponiveis;
    }

    public static String exibirLivrosAtrasados(Livro[] arr) {      //ta erra
        if (arr.length == 0 || arr == null) {
            return "nao ha livros";
        }
        Date dataAtual = new Date();
        String atrasados = "---------------------";
        atrasados += "\nLivros atrasados\n";
        for(int i = 0;i < arr.length; i++){
            if(dataAtual.getTime() > arr[i].dataDevolucao.getTime()) {
                long tempo = (dataAtual.getTime() - arr[i].dataDevolucao.getTime()) / (864 * 1 * 100000);
                atrasados += "Titulo: " + arr[i].getTitulo() + " Autor: " + arr[i].getAutor() + " Dias de atraso: " + tempo + "\n";
            }
        }
        atrasados += "\n---------------------";
        return atrasados;
    }

    public double gerarMulta(double taxaPorDiaAtrasado) {
        Date dataAtual = new Date();
        if (dataAtual.getTime() > this.dataDevolucao.getTime()) {
            long diferenca = dataAtual.getTime() - this.dataDevolucao.getTime();
            long dias = diferenca / (864 * 1 * 100000) * 1;
            double taxa = dias * taxaPorDiaAtrasado;
            return taxa;
        }
        return -1;
    }

    public static String exibeLivroMaisEmprestado(Livro[] arr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (arr.length == 0 || arr == null) {
            return "Argumento invalido, nao foi possivel encontrar nenhum livro";
        } else {
            int maisEmprestado = 0;
            String emprestados = "--------------------";
            emprestados += "\nLivro mais emprestado";
            for(int i = 0;i < arr.length; i++){
                if (arr[i].getQuantidadeEmprestimos() > arr[maisEmprestado].getQuantidadeEmprestimos()) {
                    maisEmprestado = i;
                }
            }
            emprestados +=
            "\nid: " + arr[maisEmprestado].getId() +
            "\ntitulo: " + arr[maisEmprestado].getTitulo() +
            "\nautor: " + arr[maisEmprestado].getAutor() +
            "\ndata de emprestimo: " + sdf.format(arr[maisEmprestado].getDataEmprestimo()) +
            "\ndata de devolucao: " + sdf.format(arr[maisEmprestado].getDataDevolucao()) +
            "\nstatus do livro: " + arr[maisEmprestado].getStatusLivro() +
            "\nquantidade de emprestimos: " + arr[maisEmprestado].getQuantidadeEmprestimos() +
            "\n--------------------";
            return emprestados;
        }
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "\nid: " + getId() +
        "\ntitulo: " + getTitulo() +
        "\nautor: " + getAutor() +
        "\ndata de emprestimo: " + sdf.format(getDataEmprestimo()) +
        "\ndata de devolucao: " + sdf.format(getDataDevolucao()) +
        "\nstatus do livro: " + getStatusLivro() +
        "\nquantidade de emprestimos: " + getQuantidadeEmprestimos();
    }
}
