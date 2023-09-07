package composite;

public class Leaf implements Component {

    private String nome;
    private Double preco;

    
    public Leaf() {
    }

    

    public Leaf(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }



    @Override
    public double getPreco() {
        return this.preco;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setPreco(Double preco) {
        this.preco = preco;
    }



    @Override
    public String toString() {
        return "Leaf [nome=" + nome + ", preco=" + preco + "]";
    }

    

    
    
}
