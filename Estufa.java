package br.edu.aluno.ifnmg.raa16.horticultura;

public class Estufa {
    
    private double umidade;
    private double temperatura;

    public Estufa(double temperatura, double umidade) {
        this.umidade = umidade;
        this.temperatura = temperatura;
        
        if(limiteUmidade() != 1 || limiteTemperatura() != 1)
        {
            this.umidade = 0.0;
            System.out.println("Nao foi possiviel criar esta estufa!");
            this.temperatura = 0.0;
            return;
        }
        System.out.println("Estufa criada com sucesso!");
    }
    
    public int limiteUmidade()
    {
        if(umidade < 50.00 || umidade > 80.00)
        {
            return -1;
        }
        return 1;
    }
    
    public int limiteTemperatura()
    {
        if(temperatura < 18.00 || temperatura > 24.00)
        {
            return -1;
        }
        return 1;
    }       
    
    public int novaUmidade(double umidade)
    {
        if(umidade < 50.00 && umidade > 80.00)
        {
            System.out.println("Umidade invalida!");
            return -1;
        }
        
        this.umidade = umidade;
        System.out.println("Nova umidade cadastrada!");
        return 1;    
    }
    
    public int novaTemperatura(double temperatura)
    {
        if(temperatura < 18.00 && temperatura > 24.00)
        {
            System.out.println("Temperatura invalida!");
            return -1;
        }
        
        this.temperatura = temperatura;
        System.out.println("Nova temperatura cadastrada");
        return 1;
    }
//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    
    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
//</editor-fold>

    @Override
    public String toString() {
        return "umidade = " + umidade + ", temperatura = " 
                + temperatura + '}'; 
    }
     
}
