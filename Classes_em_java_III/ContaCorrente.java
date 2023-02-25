package Classes_em_java_III;

//  14/09/2022 data da elaboração


public class ContaCorrente {
    private String nome;
    private String sexo;
    private int idade;
    private String numConta;
    private boolean flagContaConjunta;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNumConta() {
        return numConta;
    }

    public boolean getFlagContaConjunta() {
        return flagContaConjunta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNumConta(String numero) {
        this.numConta = numero;
    }

    public boolean setFlagContaConjunta(boolean flag) {
        return this.flagContaConjunta = flag;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }

    public void saldo() {
        System.out.println("Nome do correntista: " + nome);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Conta conjunta: " + flagContaConjunta);
        System.out.println("Saldo da conta: " + saldo);
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

}
