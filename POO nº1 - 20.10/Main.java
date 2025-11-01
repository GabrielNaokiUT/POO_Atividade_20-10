public class Main {

    public static void main(String[] args) {
        
        Livro livro = new Livro("Introdução à programação - Algoritmos Resolvidos", "Anita Lopes", 488);
        Livro book = new Livro("Código Limpo: Habilidades Práticas do Agile Software", "Robert Cecil Martin", 425);

        System.out.println("Livro: " + livro.titulo);
        livro.setAutor();
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Quant. de páginas: " + livro.pags); //atribuitos titulo e pags acessados diretamente na Main//
        System.out.println(" ");

        book.exibirInfo(); //atributos titulo, autor e pags exibidos usando o método exibirInfo//
    }
}

//ao tentar acessar o atributo autor diretamente na Main dá erro por ser um atributo do tipo private, e para conseguir usei get e set//