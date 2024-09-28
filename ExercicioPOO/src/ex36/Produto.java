package ex36;

public class Produto {
 private String nome;
 private Double preco;
 private int quantidadeemestoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidadeemestoque() {
        return quantidadeemestoque;
    }

    public void setQuantidadeemestoque(int quantidadeemestoque) {
        this.quantidadeemestoque = quantidadeemestoque;
    }
}
