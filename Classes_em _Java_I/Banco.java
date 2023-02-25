//  24/08/2022 data da elaboração

/*Fazer um programa para ler os dados de uma conta corrente:
• Número da Conta;
• Nome do Cliente;
• CPF;
• Saldo Da conta.
Em seguida, mostrar a tela todos os atributos. Utilize classe. */




public class Banco {
    int cdConta;
 String nmCliente;
 String cpf;
 double saldo;
 public void depositar (double valor){
 saldo += valor;
 }

 public void sacar (double valor){
 saldo -= valor;

 }
}

