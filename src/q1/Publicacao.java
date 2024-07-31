package q1;
public abstract class Publicacao {
    private String titulo;
    private String autor;
    private int anoPubli;
    private String genero;
    private String editora;
    private int qntDisp;

    public abstract void imprimirDados();

    public Publicacao(String titulo, String autor, int anoPubli, String genero, String editora, int qntDisp) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
        this.genero = genero;
        this.editora = editora;
        this.qntDisp = qntDisp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQntDisp() {
        return qntDisp;
    }

    public void setQntDisp(int qntDisp) {
        this.qntDisp = qntDisp;
    }
}

