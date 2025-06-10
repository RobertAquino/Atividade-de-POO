package br.edu.aluno.ifnmg.raa16.bibliotecaObra;

import java.time.LocalDate;
    public class Obra {
    private String isbn;
    private String titulo;
    private String autorPrincipal;
    private int anoDePublicacao;
    private int copiasDisponiveis;

    public Obra(String isbn, String titulo, String autorPrincipal,
            int anoDePublicacao, int copiasDisponiveis) {
     
    this.isbn = isbn;
    this.titulo = titulo;
    this.autorPrincipal = autorPrincipal;
    this.anoDePublicacao = anoDePublicacao;
    this.copiasDisponiveis = copiasDisponiveis; 
     
    LocalDate tempo = LocalDate.now();
    if(this.isbn == null || isbn.length() != 14 || this.titulo.isEmpty()|| this.autorPrincipal == null
        || this.copiasDisponiveis < 0 || this.anoDePublicacao <= 0 
        || this.anoDePublicacao > tempo.getYear()){
        
            this.isbn = null;
            this.titulo = null;
            this.autorPrincipal = null;
            this.anoDePublicacao = 0;
            this.copiasDisponiveis = 0; 
            System.out.println("Houve uma falha ao cadastrar a obra: " + titulo);
            return;
    }
        System.out.println("Obra "+  titulo + " cadastrada com sucesso!");
    }
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }
    //</editor-fold>
    
    public boolean emprestar()
    {
       if (!verificar()){
           System.out.println("Exemplar nao disponivel");
           return false;
       }
       
        copiasDisponiveis--;
        System.out.println("O emprestimo foi realizado com sucesso");
        toString();
        return true;           
    }
    
    public void devolver()
    {
        copiasDisponiveis++;
        System.out.println("O livro foi devolvido");
        toString();
    }
    
    public boolean verificar()
    {
       if(copiasDisponiveis > 0){
           return true;
       }
        return false;
    }
    
    public void exibir(Obra livro)
    {
        System.out.println("Livro: " + livro);
        System.out.println(" ");
    }
            
    @Override
    public String toString() {
        return "isbn = " + isbn + ", titulo = " 
                + titulo + ", autorPrincipal = " + autorPrincipal 
                + ", anoDePublicacao = " + anoDePublicacao 
                + ", copiasDisponiveis = " + copiasDisponiveis + '}';
    }
}
    
    
    


