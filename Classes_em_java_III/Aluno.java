package Classes_em_java_III;

//  14/09/2022 data da elaboração

public class Aluno {

    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaReavaliacao;

    public Aluno(String nome, String matricula, double nota1, double nota2,
            double notaReavaliacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaReavaliacao = notaReavaliacao;
    }

    public String toString() {
        System.out.println("Nome aluno: " + nome);
        System.out.println("Matricula aluno: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota reavaliação: " + notaReavaliacao);
        return "";
    }

    public double calcularMedia() {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public double calcularMediaFinal() {
        if (calcularMedia() > 6) {
            return calcularMedia();
        } else {
            double mediaFinal = (calcularMedia() + notaReavaliacao) /
                    2;
            return mediaFinal;
        }
    }
}
