
package Polimorfismo_Java.Figura;

public class Circulo extends Figura{
    private double raio;
    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }
    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
    @Override
    public void draw() {
        System.out.println("Desculpe! Não consigo desenhar!!!");
    }
}
