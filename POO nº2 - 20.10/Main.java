public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto("Dell Inspirion 15", 3499.99, 50);
        produto.exibirinfo();
        produto.venderProduto(35);
        produto.nome = "Dell XPS 13"; 
        produto.quantidade = 75;           //produto e nome modificados//
        System.out.println(" ");
        produto.exibirinfo();
    }
}

// ao acessar o atributo preco diretamente dá erro por se tratar de uma variável private, e para conseguir que fosse exibido inseri ele dentro do método exibirInfo usando get e set//
