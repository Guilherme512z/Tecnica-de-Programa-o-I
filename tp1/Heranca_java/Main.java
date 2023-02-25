package Heranca_java;

public class Main {

    public static void main(String[] args) {
        Gerente ger1 = new Gerente();
        ger1.setNome("Marcos");
        ger1.setCpf("111222333344");
        ger1.setSalario(3000);
        ger1.setSenha(1234);
        System.out.println("nome: " + ger1.getNome() + " cpf: " + ger1.getCpf() + " salario: " +
        ger1.getSalario());
        System.out.println("senha valida: " + ger1.autentica(1236));

        
    }
}
