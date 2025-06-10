package br.edu.aluno.ifnmg.raa16.bibliotecaObra;

public class Program {
    public static void main(String[] args) {
        Obra obra1 = new Obra("978-6555112511", "Senhor dos aneis", "J.R.R Tolkein", 1954, 35);
        Obra obra2 = new Obra("978-8535914849", "1974", "George Orwel", 1949, 14);
        Obra obra3 = new Obra("978-8544001516", "O Conde de Monte Cristo", "Alexandre Dumas", 1846, 45);
        Obra obra4 = new Obra("978-8540701694", "Algebra linear", "Howard Anthon", 2012, 80);
        Obra obra5 = new Obra("978-8578270698", "As cronicas de Narnia", "C.S. Lewis", 1950, 13);
        Obra obra6 = new Obra("978-0553212419", "Sherlock Holmes", "Árthur Conan Doyle", 1887, 5);
        Obra obra7 = new Obra("978-8576575320", "Jurassic Park", "Michael Crichton", 1990, 60);
        Obra obraInvalida1 = new Obra("" , "O hobbit", "J.R.R. Tolkien", 1937, 10);
        Obra obraInvalida2 = new Obra("978-8544000007" , "Os miseraveis", "Vitor Hugo", 2032, 15);
        Obra obraInvalida3 = new Obra("875-9218200358" , "", "Cristiano Ronaldo", 2018, 65);
        Obra obraInvalida4 = new Obra("978-8563560292" , "O Grande Gatsby", " F. Scott Fitzgerald", 1925, -1);
        Obra obraInvalida5 = new Obra("978-6584952034" , "As Aventuras de Tom Sawyer", "Mark Twin", 2030, 100);
        
        System.out.println("");
        
        
        //As obras invalidas nao sao cadastradas!
        obraInvalida1.exibir(obraInvalida1);
        obraInvalida5.exibir(obraInvalida5);
        
        
        //O estado de obra antes do emprestimo
        obra1.exibir(obra1);
        obra1.verificar();
        
        //O estado de obra depois do emprestimo
        obra1.emprestar();
        obra1.exibir(obra1);
        
        //O estado de obra apos a devolucao do livro
        obra1.devolver();
        obra1.exibir(obra1);
        
        //O estado de obra antes do emprestimo
        obra2.exibir(obra2);
        obra2.verificar();
        //O estado de obra depois do emprestimo
        obra2.emprestar();
        obra2.exibir(obra2);
        //O estado de obra apos a devolucao do livro
        obra2.devolver();
        obra2.exibir(obra2);
        
        
    }
}