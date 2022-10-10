class Main {
  public static void main(String[] args) {
    Item l1 = new Item("Percy Jackson e o Ladrão de Raios", "Rick Riordan", 2005, 300);
    Item l2 = new Item("O Código Da Vinci", "Dan Brown", 2003, 500);
    Estante e1 = new Estante("pequena");
    Estante e2 = new Estante("grande");
    System.out.println(e1.adicionarItem(l1));
    System.out.println(e1.adicionarItem(l2));
    System.out.println(e1.adicionarItem(l1));
    System.out.println(e1.adicionarItem(l2));
    e1.listar();
    e1.verificarLimite();
    e1.verificarPeso();
    e2.listar();
    e1.moverLivro(l1, e2);
    e2.listar();
    e2.verificarLimite();
    e2.verificarPeso();
  }
}