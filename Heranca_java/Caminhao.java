package Heranca_java;

public class Caminhao extends Veiculo {
    private int eixos;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public void exibirDados() {
        System.out.println("placa: " + super.getPlaca() + "\nano: " + super.getAno() + "\neixos: " + eixos);
    }
}