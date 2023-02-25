package Classes_em_java_IV;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno() {
    }

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

     public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltam() {
        if (calcularMedia() >= 60.00) {
            return calcularMedia();
        } else {
            return 60.00 - calcularMedia();
        }
    }

    public String toString() {
        if (calcularMedia() >= 60.00) {
            return "NOTA FINAL = " + calcularMedia() + "\nAPROVADO";
        } else {
            return "NOTA FINAL = " + calcularMedia() +
                    "\nREPROVADO" + "\nFALTARAM " + pontosFaltam() + " PONTOS";
        }

    } 
}