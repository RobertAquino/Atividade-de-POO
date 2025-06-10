package br.edu.aluno.ifnmg.raa16.horticultura;

public class Horticultura {

    public static void main(String[] args) {
      
        Estufa e1 = new Estufa(18.00, 50.00);
        Estufa e2 = new Estufa(19.00, 65.00);
        Estufa e3 = new Estufa(-16.00, 50.00);
        Estufa e4 = new Estufa(18.00, 99.00);
        Estufa e5 = new Estufa(14.00, 99.00);
    
        //Entradas validas
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        //Entradas invalidas
        System.out.println("e3: " + e3);
        System.out.println("e4: " + e4);
        System.out.println("e5: " + e5);
        
        System.out.println("");
        
        //e1 antes da mudanca de temperatura e umidade
        System.out.println("e1: " + e1);
        e1.novaTemperatura(20);
        System.out.println("e1: " + e1);
        e1.novaUmidade(65);
        System.out.println("e1; " + e1);
        
        
   }
}
