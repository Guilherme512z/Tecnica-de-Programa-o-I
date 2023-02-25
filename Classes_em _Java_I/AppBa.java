
//  24/08/2022 data da elaboração

/*Fazer um programa para ler os dados de uma conta corrente:
• Número da Conta;
• Nome do Cliente;
• CPF;
• Saldo Da conta.
Em seguida, mostrar a tela todos os atributos. Utilize classe. */


public class AppBa {
    public static void main(String[] args) {
        Banco bco = new Banco();
        bco.cdConta = 101010;
        bco.nmCliente = "Marcos Vasconcelos de Oliveira";
        bco.cpf = "11122233344";
        bco.saldo = 1000.00;
        System.out.println("Conta: " + bco.cdConta);
        System.out.println("Nome: " + bco.nmCliente);
        System.out.println("CPF: " + bco.cpf);
        System.out.println("saldo: " + bco.saldo);
        bco.sacar(100.00);
        System.out.println("Fazer saque de R$ 100.00 : " + bco.saldo);
        bco.depositar(2000.00);
        System.out.println("Fazer deposito de R$ 2.000.00 : " + bco.saldo);
    }
}