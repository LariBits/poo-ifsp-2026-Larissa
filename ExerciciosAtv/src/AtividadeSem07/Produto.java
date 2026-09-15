package AtividadeSem07;

public class Produto {
    private String nome;
    private double preco;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco (double p){
        if (p >= 0){
            this.preco = p;
        }
        else{
            System.out.println("Digite valor maior que 0.");
        }
    }

}
