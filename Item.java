class Item{
  private final int codigo;
  private final int ano;
  private final double peso;
  private final String titulo;
  private final String autor;
  private static int cont = 0; 
  Item(String titulo, String autor, int ano, double peso){
    cont++;
    this.codigo = cont;
    this.ano = ano;
    this.peso = peso;
    this.titulo = titulo;
    this.autor = autor;
  }

  int getCodigo(){
    return codigo;
  }

  int getAno(){
    return ano;
  }

  double getPeso(){
    return peso;
  }

  String getTitulo(){
    return titulo;
  }

  String getAutor(){
    return autor;
  }
}