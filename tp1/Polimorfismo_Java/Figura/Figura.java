package Polimorfismo_Java.Figura;


public abstract class Figura{
    private String cor;

public Figura(String cor) {
    this.cor = cor;
}

public abstract double area();
public abstract void draw();

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

@Override
public String toString() {
    return "Figura [cor=" + cor + "]";
}

}