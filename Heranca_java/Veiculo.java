package Heranca_java;

public class Veiculo {
    private String placa;
    private int ano;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Veiculo() {
        this("", 0);
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("placa: " + placa + "\nano: " + ano);
    }

}