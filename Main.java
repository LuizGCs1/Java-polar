class Main{
    
    public static void main(String[] agrs){
        
        Produto produto01 = new Produto();
        
        produto01.setNome("Banana");
        produto01.setPreco(2.00);
        produto01.setEstoque(30);
        
        System.out.println("Nome: " + produto01.getNome());
        System.out.println("Preço: " + produto01.getPreco());
        System.out.println("Estoque: " + produto01.getEstoque());

    }
    
}