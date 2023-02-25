package Polimorfismo_Java.Figura;
public class Triangulo extends Figura{

    private double base;
    private double altura;
    public Triangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase() {
    this.base = base;

    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public void draw(){
        System.out.println("Desculpa Não consigo Desenhar!!!");
    }
    @Override
    public String toString(){
        return "Triangulo [base="+ base + ", altura=" + altura + ",area()="+ area() + ", getCor()=" + getCor() + "]";
    }
    @Override
    public double area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }
}