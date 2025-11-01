public class Produto {

    public String nome;
    private double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void venderProduto(int unidades){ 
        if( unidades <= quantidade){
            quantidade -= unidades;
            System.out.println("Venda de " + unidades + " unidades realizada com sucesso! Quantidade disponível em estoque após venda: " + quantidade);
        }
        else{
            System.out.println("Erro! Pedido de venda ultrapassou limite de estoque.");
        }
    }
    public void exibirinfo(){
        System.out.println("Produto: " + nome + "\n" +
            "Preço: R$ " + getPreco() + "\n" +
            "Unidades disponíveis em estoque: " + quantidade + "\n");
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}
