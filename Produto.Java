public class Produto {
    // Atributos (as características do produto)
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    // Construtor (serve para criar o produto com as informações iniciais)
    public Produto(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco; // corrigido internamente para preco
    }

    // Métodos para pegar as informações (Getters)
    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public double getPreco() { return preco; }

    // Métodos para alterar as informações (Setters)
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para exibir os dados do produto de forma bonita
    public void exibirInformacoes() {
        System.out.println("ID: " + codigo + " | Nome: " + nome + " | Qtd: " + quantidade + " | Preço: R$ " + preco);
    }
}