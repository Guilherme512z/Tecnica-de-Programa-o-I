package Classes_em_Java_II;

//  31/08/2022 data da elaboração

public class AppF {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcos Vasconcelos";
        funcionario.salarioBruto = 4000.00;
        funcionario.desconto = 100;
        System.out.println(funcionario.nome);
        System.out.println(funcionario.salarioBruto);
        System.out.println(funcionario.desconto);
        System.out.println(funcionario.MostrarFuncionario());
        System.out.println("Aumentando salário em 10%");
        funcionario.AumentarSalario(10);
        System.out.println(funcionario.MostrarFuncionario());
    }
}
