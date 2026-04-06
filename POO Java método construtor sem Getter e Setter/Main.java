class Main{

    public static void main(String[] args){
        String nome = "Banana";
        double preco = 2;
        int estoque = 50;
        
    Produto produto01 = new Produto(nome, preco, estoque);
   
        produto01.exibirDados(); 
    }

}