class Estante{
  private int qtd_prateleiras;
  private int limite_itens;
  private int qtd_atual_itens;
  private double peso_suportado;
  private double peso_atual;
  Item itens[];
  
  Estante(String tamanho){
    if(tamanho == "grande"){
      qtd_prateleiras = 5;
    }else if(tamanho == "medio"){
      qtd_prateleiras = 3;
    }else{
      qtd_prateleiras = 1;
    }
    limite_itens = qtd_prateleiras * 3;
    peso_suportado = limite_itens * 300;
    itens = new Item[limite_itens];
    peso_atual = 0;
    qtd_atual_itens = 0;
  }

  boolean adicionarItem(Item item){
    if((peso_atual + item.getPeso()) > peso_suportado || (qtd_atual_itens + 1) > limite_itens){
      return false;
    }else{
      itens[qtd_atual_itens] = item;
      qtd_atual_itens++;
      peso_atual = peso_atual + item.getPeso();
      return true;
    }
  }

  boolean removerItem(Item item){
    for(int i = 0; i < qtd_atual_itens; i++){
      if(itens[i] == item){
        int cont = i+1;
        while(i < qtd_atual_itens-1){
          if(itens[cont] != null){
            itens[i] = itens[cont];
            cont++;
            i++;
          }else{
            itens[i] = null;
          }
        }
        qtd_atual_itens--;
        peso_atual = peso_atual - item.getPeso();
        return true;
      }
    }  
    return false;
  }

  boolean moverLivro(Item item, Estante estante){
    for(int i = 0; i < qtd_atual_itens; i++){
      if(itens[i] == item){
          removerItem(item);
          estante.adicionarItem(item);
          return true;
      }
    }
    return false;
  }

  void listar(){
    System.out.println("Exibindo itens da estante");
    if(qtd_atual_itens > 0){
      for(int i = 0; i < qtd_atual_itens; i++){
        System.out.println(itens[i].getTitulo());
      }
    }else{
      System.out.println("Estante vazia");
    }
  }

  void verificarPeso(){
    double diferenca = peso_suportado - peso_atual;
    System.out.println("Peso atual da estante: " + peso_atual);
    System.out.println("Peso máximo da estante: " + peso_suportado);
    System.out.println("Você pode adicionar um item de até " + diferenca + " gramas");
  }

  void verificarLimite(){
    int diferenca = limite_itens - qtd_atual_itens;
    System.out.println("Quantidade de itens atual da estante: " + qtd_atual_itens);
    System.out.println("Limite de itens da estante: " + limite_itens);
    System.out.println("Você pode adicionar " + diferenca + " iten(s)");
  }
}