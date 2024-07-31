package q1;

public class Livro extends Publicacao{
    private int edicao;
    private int isbn; //codigo livro
    public Livro(String titulo, String autor, int anoPubli, String genero, String editora, int qntDisp,int edicao, int isbn) {
        super(titulo, autor, anoPubli, genero, editora, qntDisp);
        this.setIsbn(isbn);
        this.setEdicao(edicao);
    }

    public void imprimirDados(){
        System.out.println("\nDADOS DA PUBLICAÇÃO:\n");
        System.out.println("Título da obra: "+ this.getTitulo());
        System.out.println("Autor da obra; "+ this.getAutor());
        System.out.println("Ano de publicação da obra: "+ this.getAnoPubli());
        System.out.println("Gênero da obra: "+ this.getGenero());
        System.out.println("Editora da obra: "+ this.getEditora());
        System.out.println("Quantidade disponível: "+ this.getQntDisp());
        System.out.println("Edição do livro: "+ this.getEdicao());
        System.out.println("Isbn do livro: "+ this.getIsbn());
    }
    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
