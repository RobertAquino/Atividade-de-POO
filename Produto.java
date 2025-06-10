package br.edu.aluno.ifnmg.raa16.controledeprodutos;

public class Produto {
    private String nomeDoProduto;
    private double preco;
    private double desconto;
    private int quantidadeEmEstoque;

    public Produto(String nomeDoProduto, double preco, int quantidadeEmEstoque) {
        this.nomeDoProduto = nomeDoProduto;
        this.preco = preco;
        this.desconto = 0;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        
        if(validaNome() != 1 || validaPreco() != 1 || validaQuantidade() != 1)
        {
            nomeDoProduto = null;
            preco = 0.0;
            quantidadeEmEstoque = 0;
            System.out.println("Erro no cadastro do produto");
            return;
        }
        System.out.println("O produto foi cadastrado com sucesso");
    }
    
    public int validaNome()
    {
     if(nomeDoProduto == null || nomeDoProduto.length() <= 0)
     {
         return -1;
     }
     return 1;
    }
    public int validaPreco()
    {
     if(preco < 0)
     {
         return -1;
     }
     return 1;
    }
    public int validaQuantidade()
    {
        if(quantidadeEmEstoque < 0)
        {
            return -1;
        }
        return 1;
    }
    
//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
//</editor-fold>

    public int adicionarItem(int quantidade)
    {
        quantidadeEmEstoque += quantidade;
        return quantidadeEmEstoque;
    }
    public int removeItem(boolean aVista, int quantidade)
    {
        if(quantidade > quantidadeEmEstoque)
        {
            System.out.println("Quantidade insuficiente de itens no estoque!");
            return -1;
        }
        
        if(aVista)
        {
            desconto = preco * 0.05;
            quantidadeEmEstoque -= quantidade;
            
            return quantidadeEmEstoque;
        }
        
       quantidadeEmEstoque--;
       System.out.println("Compra realizada!");
       return quantidadeEmEstoque;
    }
    
    @Override
    public String toString() {
        return "nomeDoProduto = " + nomeDoProduto + ", preco = " + preco 
                + ", desconto = " + desconto + ", quantidadeEmEstoque = " 
                + quantidadeEmEstoque;
    }
    
    
}
