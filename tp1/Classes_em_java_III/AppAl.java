package Classes_em_java_III;

//  14/09/2022 data da elaboração

public class AppAl {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marcos", "101213", 10, 8, 0);
        
        aluno1.toString();
        System.out.println("Média: "+ aluno1.calcularMedia());
        System.out.println("Média Final: "+ aluno1.calcularMediaFinal());
        
        System.out.println("");
        Aluno aluno2 = new Aluno("Maria", "121213", 5, 5, 6);
        aluno2.toString();
        System.out.println("Média: " +aluno2.calcularMedia());
        System.out.println("Média Final: "+ aluno2.calcularMediaFinal());
        }
}
