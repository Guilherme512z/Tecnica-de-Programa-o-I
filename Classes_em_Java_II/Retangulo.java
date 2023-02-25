package Classes_em_Java_II;

//  31/08/2022 data da elaboração


public class Retangulo {
        double largura;
        double altura;


public double Area(){
    return largura * altura;
    }
    public double Perimetro(){
    return 2 * (largura + altura); 
    }
    public double Diagonal(){
    return Math.sqrt(Math.pow(largura, 2) +Math.pow(altura, 2));
    }
}