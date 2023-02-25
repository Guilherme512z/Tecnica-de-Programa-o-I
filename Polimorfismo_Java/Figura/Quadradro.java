package Polimorfismo_Java.Figura;

public class Quadradro extends Retangulo {

public Quadradro(String cor, double lado){
    super(cor, lado, lado);
}


@Override
public String toString() {
    return "Quadradro [Lado=" + getLado1() + ", area()=" + area() + ",getCor()=" + getCor() + "]";
}

}