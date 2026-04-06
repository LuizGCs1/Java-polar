class Produto{
      
  private String nome;
  private double preco;
  private int estoque;
  
  public Produto (String nome, double preco, int estoque){
      this.nome = nome;
      this.preco = preco;
      this.estoque = estoque;
  }
  
    public void exibirDados(){
   
  System.out.println("Nome: " + this.nome);
  System.out.println("Preço: " + this.preco);
  System.out.println("Estoque: " + this.estoque);

   
   
  }
}
  