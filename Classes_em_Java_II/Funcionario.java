package Classes_em_Java_II;

//  31/08/2022 data da elaboração

public class Funcionario {
    String nome;
    double salarioBruto;
    double desconto;

    public double SalarioLiquido() {
        return salarioBruto - desconto;
    }

    public void AumentarSalario(double porcentagem) {
        salarioBruto *= 1 + (porcentagem / 100);
    }

    public String MostrarFuncionario() {
        return "Dados do funcionário: " + nome + " R$ " + SalarioLiquido();
    }
}