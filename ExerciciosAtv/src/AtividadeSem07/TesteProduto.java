package AtividadeSem07;

public class TesteProduto {

    public static void main (String[] args){

        Produto meuProduto = new Produto();

        meuProduto.setNome("Abacaxi");
        meuProduto.setPreco(80.0);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getPreco());


    }

}
