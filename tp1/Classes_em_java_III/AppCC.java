package Classes_em_java_III;

//  14/09/2022 data da elaboração


public class AppCC {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setNome("Fernando");
        conta1.setNumConta("1234");
        conta1.setFlagContaConjunta(false);
        conta1.setSaldo(1500);

        conta1.setSexo("Masculino");
        conta1.setIdade(29);

        ContaCorrente conta2 = new ContaCorrente();
        conta2.setNome("Maria");
        conta2.setNumConta("5312");
        conta2.setFlagContaConjunta(true);
        conta2.setSaldo(530.31);
        conta2.setSexo("Feminino");
        conta2.setIdade(45);

        ContaCorrente conta3 = new ContaCorrente();
        conta3.setNome("Joao");
        conta3.setNumConta("9621");
        conta3.setFlagContaConjunta(true);
        conta3.setSaldo(4325.12);
        conta3.setSexo("Masculino");
        conta3.setIdade(54);
        conta1.saque(3000);
        conta1.saque(300);
        conta1.saldo();

        conta2.saldo();
        conta3.saldo();

    }
}
