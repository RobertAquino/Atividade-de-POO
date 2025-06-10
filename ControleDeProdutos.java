package br.edu.aluno.ifnmg.raa16.controledeprodutos;

public class ControleDeProdutos {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Caderno", 10.00, 15);
        Produto p2 = new Produto("Caneta", 2.00, 70);
        Produto p3 = new Produto("Borracha", 1.50, 54);
        Produto p4 = new Produto("Cola", 3.50, 14);
        Produto p1Invalido = new Produto("", 2.0, 70);
        Produto p2Invalido = new Produto("Bolsa", -9.00, 50);
        Produto p3Invalido = new Produto("Caixa de Giz", 5.00, -9);
       
        //Produtos cadastrados
        System.out.println("Produto:" + p1);
        System.out.println("Produto:" + p2);
        System.out.println("Produto:" + p3);
        System.out.println("Produto:" + p4);
        //Produtos nao cadastrados
        System.out.println("Produto:" + p1Invalido);
        System.out.println("Produto:" + p2Invalido);
        System.out.println("Produto:" + p3Invalido);
        
        //p1 antes da compra
        System.out.println("p1: " + p1);
        //p1 apos a adicao de estoque;
        p1.adicionarItem(15);
        System.out.println("p1: " + p1);
        //p1 apos a remocao do estoque
        p1.removeItem(true, 15);
        System.out.println("p1: " + p1);
    
        //p2 antes da compra
        System.out.println("p2: " + p2);
        //p2 apos a adicao de estoque;
        p1.adicionarItem(15);
        System.out.println("p2: " + p2);
        //p2 apos a remocao do estoque
        p2.removeItem(true, 15);
        System.out.println("p2: " + p2);
    
    }
}
