public class Livro {

    public String titulo;
    private String autor;
    protected int pags;

    public Livro(String titulo, String autor, int pags){
        this.titulo = titulo;
        this.autor = autor; 
        this.pags = pags;
    }
    public void exibirInfo(){
        System.out.println("Livro: " + titulo + "\n" +
            "Autor :" + getAutor() + "\n" +
            "Quant. de páginas: " + pags);
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(){
        this.autor = autor;
    }
}
